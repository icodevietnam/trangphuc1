package com.icoding.trangphuc.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = News.TABLE)
public class News {
	public static final String TABLE = "news";
	public static final long serialVersionUID = 0L;

	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Article article;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "news_tags", joinColumns = { @JoinColumn(name = "news_id") }, inverseJoinColumns = { @JoinColumn(name = "tag_id") })
	private Collection<Tag> listTags;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Collection<Tag> getListTags() {
		return listTags;
	}

	public void setListTags(Collection<Tag> listTags) {
		this.listTags = listTags;
	}

}
