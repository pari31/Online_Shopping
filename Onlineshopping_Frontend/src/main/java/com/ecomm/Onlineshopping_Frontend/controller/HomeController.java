package com.ecomm.Onlineshopping_Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	/*
	 * @GetMapping("/"),@PostMapping("/sjah"),@PutMapping(""),@DeleteMapping("/dsf")
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String Home() {
		return "index";
	}
}