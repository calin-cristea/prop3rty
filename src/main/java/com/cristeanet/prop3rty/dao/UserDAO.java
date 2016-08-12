package com.cristeanet.prop3rty.dao;

import com.cristeanet.prop3rty.domain.User;

public interface UserDAO extends BaseDAO<User> {

	User searchByEmail(String email);

}
