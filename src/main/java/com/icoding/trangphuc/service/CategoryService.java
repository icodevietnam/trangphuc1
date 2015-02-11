package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.trangphuc.dao.ArticleDao;
import com.icoding.trangphuc.dao.CategoryDao;
import com.icoding.trangphuc.domain.Category;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private ArticleDao articleDao;

	/**
	 * Save Category with some property in Article
	 * 
	 * @param category
	 * @param article
	 * @return
	 */
	public Boolean saveCategory(Category category) {
		Boolean isSave = false;
		try {
			isSave = categoryDao.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSave;
	}

	public Category getCategory(long id) {
		return categoryDao.get(id);
	}
}
