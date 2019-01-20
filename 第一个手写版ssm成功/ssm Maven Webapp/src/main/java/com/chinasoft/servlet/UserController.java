package com.chinasoft.servlet;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.enity.User;
import com.chinasoft.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
@Resource(name="service")
   private UserService userService;
	@RequestMapping("/sp")
	public String toIndex(HttpServletRequest request,Model model )
	{
		
		int class_id=Integer.parseInt(request.getParameter("id"));
		User user =userService.queryUser(1111);
		model.addAttribute("user", user);
		
		return "sp";
		
		
	}
}
