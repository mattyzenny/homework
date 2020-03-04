package com.techelevator;

import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping("/")
	public String displayGreeting(HttpSession session) {

		return "Home";
	}

	@RequestMapping("/submitReviewInput")
	public String displayHome(HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());
		return "submitReviewInput";
	}
	
	@RequestMapping(path="/addPostReview", method=RequestMethod.POST)
	public String submitReview(Review review, HttpServletRequest request) {
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return "redirect:/submitReviewInput";
	}
	

}