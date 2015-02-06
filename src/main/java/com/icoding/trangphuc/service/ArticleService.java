package com.icoding.trangphuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icoding.trangphuc.dao.ArticleDao;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleDao articleDao;
}
