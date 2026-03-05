package com.waghmare.dhiraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
    //Map a class to a particular request
	
	@RequestMapping("/home")
	public ModelAndView home(Model model)
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("home");
		modelandview.addObject("Name","Dhiraj");
		modelandview.addObject("id",101);
		modelandview.addObject("Salary",50000);

		return modelandview;
		
	}
}