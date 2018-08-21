package com.zhiyou100.auth.dao;

import java.util.Set;

public interface ActionDAO {

	Set<String> findAllByMember(String id);
}
