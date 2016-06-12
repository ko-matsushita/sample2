package com.sample.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringSampleController {

	@ModelAttribute
	public SampleForm setUpSampleForm() {
		SampleForm lForm = new SampleForm();
		return lForm;
	}
	
	@RequestMapping("/")
	public ModelAndView top()
	{
		ModelAndView lMv = new ModelAndView("index");
		return lMv;
	}
	
	@RequestMapping("echo")
	public String echo(SampleForm nForm, Model nModel)
	{
		// nModel.addAttribute("name", StringEscapeUtils.escapeHtml(nForm.getName()));
		nModel.addAttribute("name", nForm.getName());
		return "echo";
	}
}
