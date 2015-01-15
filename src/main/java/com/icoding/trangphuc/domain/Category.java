package com.icoding.trangphuc.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.icoding.trangphuc.constant.CategoryStatus;

@Entity
@Table(name = Category.TABLE)
public class Category {
	public static final String TABLE = "category";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	private CategoryStatus categoryStatus;
	private Category parent;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@Id
	private Article article;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	Collection<News> listNews;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
	Collection<Product> listProducts;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CategoryStatus getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(CategoryStatus categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public Collection<News> getListNews() {
		return listNews;
	}

	public void setListNews(Collection<News> listNews) {
		this.listNews = listNews;
	}

	public Collection<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(Collection<Product> listProducts) {
		this.listProducts = listProducts;
	}

}
