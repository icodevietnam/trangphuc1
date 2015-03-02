package com.icoding.trangphuc.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = Article.TABLE)
public class Article {
	public static final String TABLE = "article";
	public static final String PK = "article_id";
	public static final long serialVersionUID = 0L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = PK)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "content")
	private String content;

	@Column(name = "seo_url")
	private String seoUrl;

	@Column(name = "real_url")
	private String realUrl;

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Column(name = "meta_keyword")
	private String metaKeyword;

	@Column(name = "meta_description")
	private String metaDescription;

	@Column(name = "date_created")
	private Date dateCreated;

	@Column(name = "date_updated")
	private Date dateUpdated;

	@Column(name = "is_enabled")
	private boolean isEnabled;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author", nullable = true)
	private Account author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSeoUrl() {
		return seoUrl;
	}

	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}

	public String getRealUrl() {
		return realUrl;
	}

	public void setRealUrl(String realUrl) {
		this.realUrl = realUrl;
	}

	public String getMetaKeyword() {
		return metaKeyword;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Account getAuthor() {
		return author;
	}

	public void setAuthor(Account author) {
		this.author = author;
	}

}
