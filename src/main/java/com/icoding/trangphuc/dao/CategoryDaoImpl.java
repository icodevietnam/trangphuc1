package com.icoding.trangphuc.dao;

import org.springframework.stereotype.Repository;

import com.icoding.trangphuc.domain.Category;

@Repository
public class CategoryDaoImpl<T extends Category> extends
		AbstractFacadeDaoImpl<Category> implements CategoryDao {

}
