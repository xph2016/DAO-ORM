package com.zhiyou100.auth.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.auth.dao.ActionDAO;
import com.zhiyou100.auth.dao.MemberDAO;
import com.zhiyou100.auth.dao.RoleDAO;
import com.zhiyou100.auth.service.MemberServiceXPH;
import com.zhiyou100.auth.vo.Member;

@Service
public class MemberServiceXPHImpl implements MemberServiceXPH {

	@Autowired
	private MemberDAO memberDAO;

	@Autowired
	private RoleDAO roleDAO;

	@Autowired
	private ActionDAO actionDAO;

	@Override
	public Member get(String mid) {
		return this.memberDAO.findById(mid);
	}

	@Override
	public Map<String, Set<String>> getRoleAndActionByMember(String mid) {
		Map<String, Set<String>> map = new HashMap<>();
		map.put("allRoles", this.roleDAO.findAllByMember(mid));
		map.put("allActions", this.actionDAO.findAllByMember(mid));
		return map;
	}

}
