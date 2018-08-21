package com.zhiyou100.auth.test;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.auth.service.MemberServiceXPH;
import com.zhiyou100.auth.vo.Member;

@ContextConfiguration(locations = {"classpath:config/test-dubbo-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {

	@Autowired
	private MemberServiceXPH memberService;
	
	@Test
	public void testGet() {
		Member member = this.memberService.get("admin");
		System.err.println(member);
	}
	
	@Test
	public void testListRole() {
		Map<String, Set<String>> map = this.memberService.getRoleAndActionByMember("admin");
		System.err.println(map.get("allRoles"));
		System.err.println("============================================");
		System.err.println(map.get("allActions"));
	}
}
