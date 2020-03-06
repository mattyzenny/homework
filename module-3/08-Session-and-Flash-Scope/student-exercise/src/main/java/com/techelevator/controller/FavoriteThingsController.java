package com.techelevator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/FavoriteThings")
@SessionAttributes({"favcolor", "favfood", "favseason"})
public class FavoriteThingsController {


	@RequestMapping(path = "/page1", method = RequestMethod.GET)
	public String getPage1(ModelMap map) {
		return "page1";
	}
	@RequestMapping(path= "/page1", method= RequestMethod.POST)
	public String saveFavoriteColor(ModelMap map, @RequestParam String color) {

			map.addAttribute("favcolor", color);

		
		return "redirect:/FavoriteThings/page2";
	}
	 
	@RequestMapping(path= "/page2", method= RequestMethod.GET)
	public String displayFavoriteFood(HttpServletRequest request) {
		
		return "page2";
	}
	
	@RequestMapping(path= "/page2", method= RequestMethod.POST)
	public String displayFavoriteFood(ModelMap map, @RequestParam String food) {
		map.addAttribute("favfood", food);
		return "redirect:/FavoriteThings/page3";
	}
	
	@RequestMapping(path= "/page3", method= RequestMethod.GET)
	public String displayFavoriteSeason(HttpServletRequest request) {
		
		return "page3";
	}
	
	@RequestMapping(path= "/page3", method= RequestMethod.POST)
	public String displayFavoriteSeason(ModelMap map, @RequestParam String season) {
		map.addAttribute("favseason", season);
		return "redirect:/FavoriteThings/page4";
	}
	
	@RequestMapping(path= "/page4", method= RequestMethod.GET)
	public String displaySummary(HttpServletRequest request) {
		
		return "page4";
	}
}
	




