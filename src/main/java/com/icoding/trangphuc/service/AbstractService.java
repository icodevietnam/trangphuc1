package com.icoding.trangphuc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.trangphuc.dao.AbstracFacadeDao;

@Service
public abstract class AbstractService<T> {
	abstract AbstracFacadeDao<T> getDao();

	@Transactional
	public Boolean save(T object) {
		return getDao().save(object);
	}

	@Transactional
	public Boolean update(T object) {
		return getDao().update(object);
	}

	@Transactional
	public List<T> getAll() {
		return getDao().getAll();
	}

	@Transactional
	public boolean delete(int id) {
		return getDao().delete(id);
	}

	@Transactional
	public T get(long id) {
		return getDao().get(id);
	}

}
