package com.ecomm.Onlineshopping_Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*Creating a controller class to handle various URL mapping*/
@Controller
public class HomeController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");//Here page is the logical view name
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
	return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");//Here page is the logical view name
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout",true);
	return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");//Here page is the logical view name
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact",true);
	return mv;
	}
	
}