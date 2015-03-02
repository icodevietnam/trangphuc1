package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.trangphuc.dao.AbstracFacadeDao;

@Service
@Transactional
public abstract class AbtractService<T> {
	
	@Autowired
	private AbstracFacadeDao<T> abstracFacadeDao;
	
	public abstract AbstracFacadeDao<T> getDao();
	
	public boolean save(T bean){
		return abstracFacadeDao.save(bean);
	}
	
	public boolean update(T bean){
		return abstracFacadeDao.update(bean);
	}
}
