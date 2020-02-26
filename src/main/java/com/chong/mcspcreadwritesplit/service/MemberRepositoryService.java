package com.chong.mcspcreadwritesplit.service;

import com.chong.common.annotation.MasterSelect;
import com.chong.common.idworker.IdWorker;
import com.chong.mcspcreadwritesplit.entity.BizMember;
import com.chong.mcspcreadwritesplit.repository.MemberRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class MemberRepositoryService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private IdWorker idWorker;

    @MasterSelect
    public List<BizMember> getMemberList() {
        List<BizMember> list = null;
        list = memberRepository.findAll();
        return list;
    }

    public BizMember getMember(Long id) {
        Optional optional = memberRepository.findById(id);
        if (optional.isPresent()) {
            return (BizMember) optional.get();
        } else {
            return null;
        }
    }

    public BizMember saveMember(String name) {
        BizMember member = newMember();
        if(StringUtils.isNotBlank(name)){
            member.setName(name);
        }
        return memberRepository.save(member);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    private BizMember newMember() {
        int random = (new Random()).nextInt(1000);
        BizMember member = new BizMember();
        member.setId(idWorker.nextId());
        member.setAge(random % 100);
        member.setName("会员名" + random);
        member.setGender("" + ((random % 2) + 1));
        member.setIsDelete("0");
        member.setCreateTime(new Timestamp(System.currentTimeMillis()));
        member.setCreateUser((long) (random % 1000));
        return member;
    }
}
