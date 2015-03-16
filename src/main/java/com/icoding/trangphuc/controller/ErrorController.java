package com.icoding.trangphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

	@RequestMapping(value = "{/Error/{msg}")
	public String showErrorPage(Model model, @PathVariable String msg) {
		
		model.addAttribute("msg",msg);
		return "";
	}
}
