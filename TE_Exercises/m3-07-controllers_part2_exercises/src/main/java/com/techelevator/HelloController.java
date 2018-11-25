package com.techelevator;

import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path = "/ReviewList", method = RequestMethod.GET)
	public String showReviewList(HttpServletRequest request) {
		request.setAttribute("ReviewList", reviewDao.getAllReviews());

		return "ReviewList";
	}
	
	@RequestMapping(path = "/reviewPost", method = RequestMethod.GET)
	public String showReviewPost() {
		return "reviewPost";
	}
	
	@RequestMapping(path = "/reviewPost", method = RequestMethod.POST)
	public String showReviewPost(HttpServletRequest request) {
		LocalDateTime datePosted = LocalDateTime.now();
		Review review = new Review();
		review.setUsername(request.getParameter("username"));
		review.setRating(Integer.parseInt(request.getParameter("rating")));
		review.setTitle(request.getParameter("title"));
		review.setText(request.getParameter("text"));
		review.setDateSubmitted(datePosted);
		reviewDao.save(review);

		return "redirect:/ReviewList";
	}
}
