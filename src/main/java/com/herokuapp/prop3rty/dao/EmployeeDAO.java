package com.herokuapp.prop3rty.dao;

import java.util.Collection;

import com.herokuapp.prop3rty.domain.Employee;

public interface EmployeeDAO extends BaseDAO<Employee>{

	Collection<Employee> searchByName(String query);
}
