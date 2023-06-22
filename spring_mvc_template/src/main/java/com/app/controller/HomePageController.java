package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller //mandatory to tell sc :following is req handling 
//controller =handler ,containing req handling methods
public class HomePageController {
	
	public HomePageController() {
		System.out.println("In Ctor of"+getClass());
	}
	
	//add req handler method to forward the bclient to index.jsp
	@RequestMapping("/") //can interceptget/put/post/delete
	public ModelAndView showHomePage() {
		System.out.println("in show home page..");
		//API o.s.w.s.ModelAndView(String lvn,String modelAttributeName,Object value)
		return new ModelAndView("/index","timestamp",LocalDateTime.now());
		//Handler ret--> Mnv-->D.S-->sends Logical view name-->V.R//-->ActualViewName:/WEB-INF/views
		//   /index.jsp -->D.S
		//chexks of model Atrributes-->yes-->saves it under the request scope
		//-->why>sever pull-->RD rd=request.getRD("/WEB_INF/views/index.jsp")
		//rd.forward(request,response)-->JSP-->${...}
	}

}
