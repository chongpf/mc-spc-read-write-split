package com.chong.mcspcreadwritesplit.repository;

import com.chong.mcspcreadwritesplit.entity.BizMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<BizMember,Long> {
    List<BizMember> findByNameAndAgeBetween(String name, Integer fromAge, Integer toAge);
}
