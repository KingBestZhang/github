package com.chinasoft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.enity.User;
import com.chinasoft.service.HrmService;
import com.chinasoft.unity.HrmConstans;

/**
 * 
 * 
 * @author Administrator
 * 处理用户请求的控制器
 *
 */
@Controller
public class UserController {
  /**
   * 
   * 自动注入userService
   */
	@Autowired
	@Qualifier("hrmService")
	private HrmService hrmService;
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("loginname")String loginname,@RequestParam("password") 
	 String password,HttpSession session ,ModelAndView mv)
	{
		//调用业务逻辑层判断用户是否可以登录
		User user  = hrmService.login(loginname, password);
		if(user!=null)
		{
			//将用户数据存入session
			session.setAttribute(HrmConstans.USER_SESSION, user);
			//客户跳转到主页面
			mv.setViewName("redirect:/mian");
		}
		else
		{
			//设置登录失败的信息
			mv.addObject("message", "登录账户或者密码不正确");
			mv.setViewName("forward:/loginForm");
		}
		return null;
		
	}
}
