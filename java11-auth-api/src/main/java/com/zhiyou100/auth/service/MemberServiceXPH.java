package com.zhiyou100.auth.service;

import java.util.Map;
import java.util.Set;

import com.zhiyou100.auth.vo.Member;

public interface MemberServiceXPH {

	/**
	 * 根据用户ID获得一个用户的完整对象信息，包含密码和锁定状态
	 * @param mid 要查询的用户ID
	 * @return 用户对象，如果用户不存在则返回null
	 * */
	public Member get(String mid);
	
	/**
	 * 根据指定的用户编号获得其对应的所有授权信息（角色、权限）
	 * @param mid 用户ID
	 * @return 返回的信息里面包含两类数据：
	 * 1、 key = allRoles   | value = 用户具备的所有角色
	 * 2、 key = allActions | value = 用户具备的所有权限
	 * */
	public Map<String, Set<String>> getRoleAndActionByMember(String mid);
}
