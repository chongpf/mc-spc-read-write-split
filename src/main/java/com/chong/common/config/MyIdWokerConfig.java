package com.chong.common.config;

import com.chong.common.idworker.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置分布式key生成器 snowflake算法的实现
 * */
@Configuration
public class MyIdWokerConfig {

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
