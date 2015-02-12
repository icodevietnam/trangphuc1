package com.icoding.trangphuc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = Category.TABLE)
public class Category {
	public static final String TABLE = "category";
	public static final String PK = "category_id";
	public static final long serialVersionUID = 0L;

	@GeneratedValue(generator = "articleGenerator")
	@GenericGenerator(name = "articleGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "article"))
	@Id
	@Column(name = PK)
	private long id;

	@JoinColumn(name = PK)
	@OneToOne
	@MapsId
	private Article article;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	private List<Category> listCategories;

	@ManyToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Category parent;

	private String categoryStatus;

	public List<Category> getListCategories() {
		return listCategories;
	}

	public void setListCategories(List<Category> listCategories) {
		this.listCategories = listCategories;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public long getId() {
		return id;
	}

	public String getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(String categoryStatus) {
		this.categoryStatus = categoryStatus;
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
