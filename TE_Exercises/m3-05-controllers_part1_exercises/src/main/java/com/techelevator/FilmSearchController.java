package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

	@RequestMapping(path="/filmList", method=RequestMethod.GET)
    public String showFilmSearchForm() {
        return "filmList";
    }
	
	@RequestMapping(path = "/filmListResult", method = RequestMethod.GET)
    public String searchFilms(@RequestParam String genre, String minLength, String maxLength, HttpServletRequest request) {
		int minLengthAsInt = Integer.parseInt(minLength);
		int maxLengthAsInt = Integer.parseInt(maxLength);
		request.setAttribute("filmList", filmDao.getFilmsBetween(genre, minLengthAsInt, maxLengthAsInt));
        return "filmList";
    }
    
    
}