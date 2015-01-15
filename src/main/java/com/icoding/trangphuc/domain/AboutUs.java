package com.icoding.trangphuc.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = AboutUs.TABLE)
public class AboutUs {
	public static final String TABLE = "about_us";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	@OneToOne(fetch = FetchType.LAZY)
	private Article article;
	
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
