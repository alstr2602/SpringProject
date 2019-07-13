package com.everis.service;

import java.util.List;

public interface ICRUD<T> {
	
	T create(T obj);
	T update(T obj);
	List<T> list();
	T read(Integer id);
	void delete(Integer id);

}
