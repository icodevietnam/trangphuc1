package com.icoding.trangphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/admin/login")
	public String showLogin() {
		return "login";
	}
}
