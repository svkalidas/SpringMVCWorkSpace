package com.ksv.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ksv.model.Student;

@Controller
public class StudentRegistrationController {
	
	@RequestMapping(value="/studentRegistration",method=RequestMethod.GET)
	public ModelAndView studentRegistration(){
		
		ModelAndView modelAndView = new ModelAndView("studentRegistrationPage");
		//modelAndView.addObject("message1","CHRIST COLLEGE OF ENGINEERING");
		return modelAndView;
	}
	
	/*@RequestMapping(value="/studentDetails", method=RequestMethod.POST)
	public ModelAndView displayStudentDetails(@RequestParam("name") String name, 
			@RequestParam("qualification") String qlifctn, @RequestParam("email") String email){
		
		ModelAndView modelAndView = new ModelAndView("registrationSuccessPage");
		modelAndView.addObject("message2","Registration Successfull...!!!!");
		modelAndView.addObject("name",name);
		modelAndView.addObject("qulfctn",qlifctn);
		modelAndView.addObject("email",email);
		return modelAndView;
		
	}*/
	@ModelAttribute
	public void setCommenMessage(Model model){
		
		model.addAttribute("message1", "CHRIST COLLAGEE OF ENGINEERING");
		model.addAttribute("message2","Registerd Successfully......!");
	}
	
	/*@InitBinder
	public void initBinder(WebDataBinder binder){
		
		//binder.setDisallowedFields(new String[]{"mobileNo"});
	}*/
	
	@RequestMapping(value="/studentDetails", method=RequestMethod.POST)
	public ModelAndView displayStudentDetails(@Valid @ModelAttribute("studentDetails") Student student, BindingResult result){
		ModelAndView modelAndView = null;
		if(result.hasErrors()){
			modelAndView = new ModelAndView("studentRegistrationPage");
		}else{
			
			modelAndView = new ModelAndView("registrationSuccessPage");
		}
		return modelAndView;
	}

}
