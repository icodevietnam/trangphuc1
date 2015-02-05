package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icoding.trangphuc.dao.AbstracFacadeDao;
import com.icoding.trangphuc.dao.CategoryDao;
import com.icoding.trangphuc.domain.Category;

@Service
public class CategoryService extends AbstractService<Category> {
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	AbstracFacadeDao<Category> getDao() {
		return categoryDao;
	}
	
	
}
