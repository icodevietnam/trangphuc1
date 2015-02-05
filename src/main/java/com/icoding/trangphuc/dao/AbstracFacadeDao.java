package com.icoding.trangphuc.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface AbstracFacadeDao<T> {

	List<T> getAll();

	boolean save(T bean);

	boolean update(T bean);

	boolean delete(long id);
	
	T get(long id);

	List<T> getListByCriteria(DetachedCriteria detachedCriteria);

	List<T> getListByCriteria(DetachedCriteria detachedCriteria, int offset,
			int size);

	boolean checkDuplicate(Class<T> clazz, boolean isEqual, String columnName,
			Object value);

	List<T> getListByColumn(Class<T> clazz, boolean isEqual, String columnName,
			Object value);
}
