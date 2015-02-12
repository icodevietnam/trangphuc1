package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.icoding.trangphuc.dao.AbstracFacadeDao;

public abstract class AbtractService<T> {
	
	@Autowired
	private AbstracFacadeDao<T> abstracFacadeDao;
	
	public abstract AbstracFacadeDao<T> getDao();
	
	public boolean save(T bean){
		return abstracFacadeDao.save(bean);
	}
}
