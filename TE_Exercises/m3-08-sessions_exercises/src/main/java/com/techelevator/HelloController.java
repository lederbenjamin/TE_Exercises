package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("favoriteThings")
public class HelloController {

	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
    public String showPage1() {

        return "page1";
    }

    @RequestMapping(path = "/page1", method = RequestMethod.POST)
    public String handlePage1Form(
    		@RequestParam String favoriteColor, ModelMap model) {

    	FavoriteThings favoriteThings = new FavoriteThings();
        favoriteThings.setFavoriteColor(favoriteColor);
        model.addAttribute("favoriteThings", favoriteThings);

        return "redirect:/page2";

    }

    @RequestMapping(path = "/page2", method = RequestMethod.GET)
    public String showPage2() {
        return "page2";
    }

    @RequestMapping(path = "/page2", method = RequestMethod.POST)
    public String handlePage2Form(
            @RequestParam String favoriteFood, ModelMap model) {

        FavoriteThings favoriteThings = (FavoriteThings) model.get("favoriteThings");
        favoriteThings.setFavoriteFood(favoriteFood);

        return "redirect:/page3";
    }

    @RequestMapping(path = "/page3", method = RequestMethod.GET)
    public String showPage3() {
        return "page3";
    }

    @RequestMapping(path = "/page3", method = RequestMethod.POST)
    public String handlePage3Form(
            @RequestParam String favoriteSeason, ModelMap model) {

        FavoriteThings favoriteThings = (FavoriteThings) model.get("favoriteThings");
        favoriteThings.setFavoriteSeason(favoriteSeason);


        return "redirect:/summary";
    }

    @RequestMapping(path = "/summary", method = RequestMethod.GET)
    public String showSummary() {
        return "summary";
    }
	
}
