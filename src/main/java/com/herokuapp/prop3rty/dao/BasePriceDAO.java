package com.herokuapp.prop3rty.dao;

import java.util.Collection;

import com.herokuapp.prop3rty.domain.Apartment;

public interface ApartmentDAO extends BaseDAO<Apartment>{

	Collection<Apartment> searchByName(String query);
}
