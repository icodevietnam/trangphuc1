package com.icoding.trangphuc.dao;

import java.util.ArrayList;

import com.icoding.trangphuc.domain.Category;

public interface CategoryDao extends AbstracFacadeDao<Category> {

	public ArrayList<Category> getListCategoryByStatus(String categoryStatus);

	public ArrayList<Category> getParentCategoryByStatus(String categoryStatus);
}
