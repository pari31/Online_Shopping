package com.ecomm.Onlineshopping_Frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.DAO.CategoryDAO;
import com.ecomm.DTO.CategoryDTO;

/*Creating a controller class to handle various URL mapping*/
@Controller
public class HomeController {

	// Passing the CategoryDAO from the Onlineshopping_Backend 
	 @Autowired
	 private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");// Here page is the logical view name
		mv.addObject("title", "Home");
		
		/*passing the list of categories*/
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");// Here page is the logical view name
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");// Here page is the logical view name
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/* Methods to load all the products based on the category */
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");// Here page is the logical view name
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = "show/category/{CategoryId}/products")
	public ModelAndView showCategoryProducts(@PathVariable("CategoryId")int id) {
		ModelAndView mv = new ModelAndView("page");// Here page is the logical view name
		 
		//categoryDAO to fetch a single category
		
		CategoryDTO category = null;
		category = categoryDAO.get(id);
		mv.addObject("title", category.getCategoryName());
		
		//Passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		//Passing the single category object
		mv.addObject("category", category);	
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

}