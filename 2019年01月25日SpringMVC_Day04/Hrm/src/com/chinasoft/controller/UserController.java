package com.chinasoft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.entity.User;
import com.chinasoft.service.HrmService;
import com.chinasoft.util.HrmConstants;
/**
 * 
 * @author Administrator
 *  处理用户请求的控制器  handler
 */
@Controller
public class UserController {

	/**
	 * 自动注入useService
	 */
	@Autowired
	@Qualifier("hrmService")
	private HrmService hrmService;
	
	@RequestMapping("/login")
	public ModelAndView login(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			HttpSession session,
			ModelAndView mv)
	{
		//调用业务层逻辑判断用户是否可以登陆
		User user = hrmService.login(loginname, password);
		 if(user != null)
		 {
			 //将用户数据存入session
			 session.setAttribute(HrmConstants.USER_SESSION, user);
			 //客户跳转到主页面
			 mv.setViewName("redirect:/main");
		 }else
		 {
			 //设置登陆失败的信息
			 mv.addObject("message","登陆名或密码不正确，请重新输入");
			 mv.setViewName("forward:/loginForm");
		 }
		return mv;
	}
}
