package com.chong.mcspcreadwritesplit;

import com.chong.mcspcreadwritesplit.service.MemberRepositoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class McspcreadwritesplitApplicationTests {

    @Autowired
	private MemberRepositoryService service;

	@Test
	void contextLoads() {
	}

	@Test
    void runService(){
	    service.saveMember("springBootTest");
    }
}
