package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	
	@RequestMapping("/search")
	public String searchPage()
	{
		return "search";
	}
	
	@RequestMapping("/srch")
	public RedirectView searchPage(@RequestParam("search") String query )
	{
		RedirectView redirect = new RedirectView();
		String url ="https://www.google.com/search?q="+query;
		
		redirect.setUrl(url);
		return redirect ;
	}
}
