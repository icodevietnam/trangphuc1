package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.trangphuc.dao.AbstracFacadeDao;
import com.icoding.trangphuc.dao.CategoryDao;
import com.icoding.trangphuc.domain.Category;

@Service
@Transactional
public class CategoryService extends AbtractService<Category> {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public AbstracFacadeDao<Category> getDao() {
		return categoryDao;
	}

}
