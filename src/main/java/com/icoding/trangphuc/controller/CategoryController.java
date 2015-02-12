package com.icoding.trangphuc.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icoding.trangphuc.domain.Article;
import com.icoding.trangphuc.domain.Category;
import com.icoding.trangphuc.service.CategoryService;
import com.icoding.trangphuc.utils.UrlUtils;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/admin/category/admin", method = RequestMethod.GET)
	public String adminCategory() {
		return "categoryAdmin";
	}

	@RequestMapping(value = "/admin/category/news", method = RequestMethod.GET)
	public String newsCategory() {
		return "categoryNews";
	}

	@RequestMapping(value = "admin/saveCategory", method = RequestMethod.POST)
	public @ResponseBody String saveCategory(
			@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "categoryStatus", required = false) String categoryStatus) {
		Article article = new Article();
		article.setTitle(title);
		article.setDescription(description);
		article.setSeoUrl(UrlUtils.friendlySeoUrl(title));
		article.setDateCreated(new Date());
		article.setDateUpdated(new Date());

		// Create Category Object
		Category category = new Category();
		category.setArticle(article);

		try {
			categoryService.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
