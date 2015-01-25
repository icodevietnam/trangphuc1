package com.icoding.trangphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value ={"admin/login","admin"}, method = RequestMethod.GET)
	public String showLogin() {
		return "showLogin";
	}

}
