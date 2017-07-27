package com.cn.link.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.link.model.User;
import com.cn.link.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("showUser")
	public String selectByPrimaryKey(HttpServletRequest request, Model model) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		User user = userService.selectByPrimaryKey(id);
		model.addAttribute("user", user);
		model.addAttribute("user.id", user.getId());
		return "showUser";
	}
	
}
