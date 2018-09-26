package com.springmvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String ShowMyPage()
	{
		return "main-menu";
	}
	
	@RequestMapping("/showform")
	
	public String Showform()
	{
		return "input";
	}
	
	@RequestMapping("/showHello")
	public String ShowHello()
	{
		return "show-hello";
	}
	
	
	/*public String lets(HttpServletRequest request,Model model)
	{
		String n=request.getParameter("textBox");
		n=n.toUpperCase();
		String r= "Hi "+n;
		model.addAttribut("message",n);
		
		${message}
	}*/

}
