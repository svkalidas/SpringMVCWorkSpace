package com.ksv.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController1 {

	@RequestMapping("/welcome/{name}/{userName}")
	public ModelAndView handleRequestInternal(@PathVariable Map<String, String> pathVars) throws Exception {
		
		String name  = pathVars.get("name");
		String userName = pathVars.get("userName");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("message", "Explore Your Skills here Mr. "/*+pathVariables.get("name")+"( "+pathVariables.get("userName")*/+")");
		return modelAndView;
		
	}

}
