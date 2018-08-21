package com.zhiyou100.auth.dao;

import com.zhiyou100.auth.vo.Member;

public interface MemberDAO {

	Member findById(String id);
}
