package com.techelevator;


import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping(path="/actorList", method=RequestMethod.GET)
	public String showSearchActorForm() {
		return "actorList";
	}
	
	@RequestMapping(path = "/actorListResult", method = RequestMethod.GET)
	public String showActorSearchResults(@RequestParam String lastName, HttpServletRequest request) {
		lastName = lastName.toUpperCase();
		if (!lastName.equals("")) {
			request.setAttribute("actors", actorDao.getMatchingActors(lastName));
		}
		return "actorList";
	}
}
