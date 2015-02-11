package com.icoding.trangphuc.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icoding.trangphuc.constant.CategoryStatus;
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

	@RequestMapping(value = "admin/category/admin/insert", method = RequestMethod.POST)
	public @ResponseBody String insertCategory(Model model,
			@RequestParam String articleTitle,
			@RequestParam String articleDescription,
			@RequestParam long idCatParent, @RequestParam long orders,
			@RequestParam String categoryStatus) {
		try {
			Article article = new Article();
			article.setTitle(articleTitle);
			article.setDateCreated(new Date());
			article.setSeoUrl("/" + UrlUtils.friendlySeoUrl(articleTitle));
			Category cat = new Category();
			cat.setArticle(article);
			cat.setCategoryStatus(CategoryStatus.ADMIN.toString());
			Category parent = categoryService.getCategory(idCatParent);
			cat.setOrder(orders);
			cat.setParent(parent);
			categoryService.saveCategory(cat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "true";
	}

}
