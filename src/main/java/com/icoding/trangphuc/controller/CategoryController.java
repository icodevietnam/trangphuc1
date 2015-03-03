package com.icoding.trangphuc.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icoding.trangphuc.domain.Account;
import com.icoding.trangphuc.domain.Article;
import com.icoding.trangphuc.domain.Category;
import com.icoding.trangphuc.dto.Message;
import com.icoding.trangphuc.service.CategoryService;
import com.icoding.trangphuc.utils.UrlUtils;

@Controller
public class CategoryController {

	@ModelAttribute
	public void setVaryResponseHeader(HttpServletResponse response) {
		response.setHeader("Vary", "Accept");
	}

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
	public @ResponseBody Message saveCategory(
			@RequestParam(value = "txtTitle", required = false) String title,
			@RequestParam(value = "txtDescription", required = false) String description,
			@RequestParam(value = "categoryStatus", required = false) String categoryStatus,
			@RequestParam(value = "txtOrders", required = false) String orders,
			@RequestParam(value = "txtMetaKeyword", required = false) String metaKeyword,
			@RequestParam(value = "txtMetaDescription", required = false) String metaDescription,
			HttpServletRequest request) {

		Article article = new Article();
		article.setTitle(title);
		article.setDescription(description);
		article.setSeoUrl(UrlUtils.friendlySeoUrl(title));
		article.setDateCreated(new Date());
		article.setDateUpdated(new Date());
		article.setMetaKeyword(metaKeyword);
		article.setMetaDescription(metaDescription);
		HttpSession session = request.getSession();
		Account account = (Account) session.getAttribute("admin");
		if (account.equals(null)) {
			article.setAuthor(account);
		}
		// Create Category Object
		Category category = new Category();
		category.setArticle(article);
		category.setCategoryStatus(categoryStatus);
		category.setOrders(Long.parseLong(orders));
		try {
			categoryService.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Message msg = new Message();
		msg.setMessage("true");
		return msg;
	}

	@RequestMapping(value = "admin/showCategory", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Category> listCategoryAdmin(
			@RequestParam(value = "categoryStatus") String categoryStatus) {
		ArrayList<Category> listCategories = categoryService
				.getParentCategoryByStatus(categoryStatus);
		return listCategories;
	}
}
