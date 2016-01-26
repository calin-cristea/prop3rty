package com.herokuapp.prop3rty.dao;

import java.util.Collection;

import com.herokuapp.prop3rty.domain.AbstractModel;

public interface BaseDAO<T extends AbstractModel> {

	Collection<T> getAll();
	
	T findById(Long id);
	
	T update(T model);
	
	boolean delete(T model);
}
