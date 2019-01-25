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
 *  �����û�����Ŀ�����  handler
 */
@Controller
public class UserController {

	/**
	 * �Զ�ע��useService
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
		//����ҵ����߼��ж��û��Ƿ���Ե�½
		User user = hrmService.login(loginname, password);
		 if(user != null)
		 {
			 //���û����ݴ���session
			 session.setAttribute(HrmConstants.USER_SESSION, user);
			 //�ͻ���ת����ҳ��
			 mv.setViewName("redirect:/main");
		 }else
		 {
			 //���õ�½ʧ�ܵ���Ϣ
			 mv.addObject("message","��½�������벻��ȷ������������");
			 mv.setViewName("forward:/loginForm");
		 }
		return mv;
	}
}
