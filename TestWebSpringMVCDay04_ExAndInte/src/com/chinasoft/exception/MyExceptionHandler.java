package com.chinasoft.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler({ArithmeticException.class})
      public ModelAndView myException(Exception ex)
      {  
    	  ModelAndView mv = new ModelAndView("exception");
    	  System.out.println("异常处理类---》"+ex);
    	  mv.addObject("ex", ex);
		return mv;
    	    
      }
}
