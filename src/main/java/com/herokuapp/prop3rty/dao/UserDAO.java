package com.herokuapp.prop3rty.dao;

import java.util.Collection;

import com.herokuapp.prop3rty.domain.User;

public interface UserDAO extends BaseDAO<User> {
	Collection<User> searchByName(String query);

}
