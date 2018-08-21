package com.zhiyou100.auth.dao;

import java.util.Set;

public interface RoleDAO {

	Set<String> findAllByMember(String id);
}
