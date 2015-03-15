package com.icoding.trangphuc.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.icoding.trangphuc.domain.Category;

@Repository
public class CategoryDaoImpl<T extends Category> extends
		AbstractFacadeDaoImpl<Category> implements CategoryDao {

	@Override
	public ArrayList<Category> getListCategoryByStatus(String categoryStatus) {
		ArrayList<Category> listCategories = new ArrayList<Category>();
		try {
			listCategories = (ArrayList<Category>) getCurrentSession()
					.createQuery(
							" SELECT * FROM CATEGORY WHERE category_status = ? ORDERS BY 'orders' DESC ")
					.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCategories;
	}

	@Override
	public ArrayList<Category> getParentCategoryByStatus(String categoryStatus) {
		ArrayList<Category> listCategories = new ArrayList<Category>();
		try {
			listCategories = (ArrayList<Category>) getCurrentSession()
					.createQuery(
							" SELECT * FROM CATEGORY WHERE category_status = ? AND parent is null ORDERS BY 'orders' DESC ")
					.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCategories;
	}

}
