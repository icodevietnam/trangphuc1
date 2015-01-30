package com.icoding.trangphuc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Article.TABLE)
public class Article {
	public static final String TABLE = "article";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = Article.PK)
	private long id;
	
}
