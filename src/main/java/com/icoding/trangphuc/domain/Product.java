package com.icoding.trangphuc.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = Product.TABLE)
public class Product {
	public static final String TABLE = "product";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Article article;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
