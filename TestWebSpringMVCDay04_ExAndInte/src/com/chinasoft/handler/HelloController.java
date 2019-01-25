package com.chinasoft.handler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.chinasoft.entity.Stu;
import com.chinasoft.entity.Student;

@Controller
@RequestMapping("/first")
public class HelloController {

	@RequestMapping({"/hello.do","/hello123"})
	public String hello()
	{
		return "success";
	}
	
	@RequestMapping("/testForword")
	public String testForward(Model model)
	{
		 
	   System.out.println("����ת��");
	   
	   return "forward:/view/success.jsp"; //request.getRequestDispacher().forward()
	}
	@RequestMapping("/testRedirect")
	public String testRedirect()
	{
	   System.out.println("�ض���");
	   return "redirect:/view/success.jsp";//response.sendRedirect()
	}
	
	@RequestMapping("/testConverter")
	public String testConverter(@RequestParam("studentInfo") Student stu)
	{
	   System.out.println(stu.getStuNo()+","+stu.getStuName()+","+stu.getStuAge());
	   return "redirect:/view/success.jsp";
	}
	
	@RequestMapping("/testLoginConverter")
	public String testLoginConverter(@RequestParam("studentLogin") Stu  stu)
	{
	   System.out.println(stu.getUsername()+","+stu.getUserpass());
	   return "redirect:/view/success.jsp";
	}
	@RequestMapping("/testFormatting")
	public String testFormatting(@Valid Stu stu1,BindingResult result)
	{
	   System.out.println(stu1.getUsername()+","+stu1.getUserpass()+","+stu1.getBirthday()+","+stu1.getEmail());
	   for(FieldError error:result.getFieldErrors())
	   {
		   System.out.println(error.getDefaultMessage());
	   }
	   return "redirect:/view/success.jsp";
	}
	
	@RequestMapping("/testUpload")
	public String testUpload(@RequestParam("username") String name,@RequestParam("file") MultipartFile file)
	{
	   System.out.println("username:\t"+name);
	   try {
		InputStream input = file.getInputStream();
		OutputStream out = new FileOutputStream("e:\\abc.jpg");
		byte [] bs = new byte[1024];
		while(input.read(bs) !=-1)
		{
			out.write(bs);
		}
		out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   return "redirect:/view/success.jsp";
	}
	@RequestMapping("/testException")
	public String testException()
	{
		return "exception";
		
	}
	
}
