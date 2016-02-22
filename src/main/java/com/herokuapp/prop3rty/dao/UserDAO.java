package com.herokuapp.prop3rty.dao;

import com.herokuapp.prop3rty.domain.User;

public interface UserDAO extends BaseDAO<User> {

	User searchByEmail(String email);

}
