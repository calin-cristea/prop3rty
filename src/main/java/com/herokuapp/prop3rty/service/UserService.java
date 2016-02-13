package com.herokuapp.prop3rty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.prop3rty.dao.UserDAO;
import com.herokuapp.prop3rty.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public User save(User user) {
		if (dao.searchByEmail(user.getEmail()) != null) {
			user.setErrorMessage("Username already exists.");
			return user;
		}
		return dao.update(user);
		
	}
	
}
