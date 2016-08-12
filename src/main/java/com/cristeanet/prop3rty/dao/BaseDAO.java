package com.cristeanet.prop3rty.dao;

import java.util.Collection;

import com.cristeanet.prop3rty.domain.AbstractModel;

public interface BaseDAO<T extends AbstractModel> {

	Collection<T> getAll();
	
	T getById(Long id);
	
	T update(T model);
	
	boolean delete(T model);
}
