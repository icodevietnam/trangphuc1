package com.icoding.trangphuc.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = Category.TABLE)
public class Category {
	public static final String TABLE = "category";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	@Id
	@GeneratedValue
	@Column(name = Category.PK)
	private long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Article article;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
