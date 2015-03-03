package com.icoding.trangphuc.service;

import java.util.ArrayList;

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

	public ArrayList<Category> getListCategoryByStatus(String categoryStatus) {
		return categoryDao.getListCategoryByStatus(categoryStatus);
	}

	public ArrayList<Category> getParentCategoryByStatus(String categoryStatus) {
		return categoryDao.getParentCategoryByStatus(categoryStatus);
	}

}
