package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController
{
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView check()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("msg","HELOOOOOO i m MVC ");
		return mv;
	}
}
