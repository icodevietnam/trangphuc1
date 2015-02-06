package com.icoding.trangphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

	@RequestMapping(value = "/admin/category/admin", method = RequestMethod.GET)
	public String adminCategory() {
		return "categoryAdmin";
	}

	@RequestMapping(value = "/admin/category/news", method = RequestMethod.GET)
	public String newsCategory() {
		return "categoryNews";
	}

}
