package com.chong.common.aspect;

import com.chong.common.annotation.MasterSelect;
import io.shardingsphere.api.HintManager;
import io.shardingsphere.core.hint.HintManagerHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MasterSelectAspect {

    @Pointcut(value = "execution(* com.chong.mcspcreadwritesplit.service.*.*(..))")
    public void pointcutOnService() {
    }

    @Around(value = "pointcutOnService()")
    public Object setMasterSelect(ProceedingJoinPoint joinPoint) throws Throwable {
        Object object = null;
        Throwable currentThrowable = null;
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        if (methodSignature.getMethod().isAnnotationPresent(MasterSelect.class)) {
            HintManager.getInstance().setMasterRouteOnly();
        }
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            currentThrowable = throwable;
        } finally {
            HintManagerHolder.clear();
            if (currentThrowable != null) {
                throw currentThrowable;
            }
        }
        return object;
    }
}
