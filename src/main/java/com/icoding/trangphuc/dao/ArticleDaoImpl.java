package com.icoding.trangphuc.dao;

import org.springframework.stereotype.Repository;

import com.icoding.trangphuc.domain.Article;

@Repository
public class ArticleDaoImpl<T extends Article> extends
		AbstractFacadeDaoImpl<Article> implements ArticleDao {
	
}
