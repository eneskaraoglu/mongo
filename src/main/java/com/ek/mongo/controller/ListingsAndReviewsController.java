package com.ek.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ek.mongo.models.ListingsAndReviewsModel;
import com.ek.mongo.services.ListingsAndReviewsService;

@RestController
public class ListingsAndReviewsController {

	 @Autowired
	private ListingsAndReviewsService listingsAndReviewsSevice ;

	@GetMapping("/findBySummaryLike/{summary}")
	public List<ListingsAndReviewsModel> getListingsAndReviews(@PathVariable String summary){
	return listingsAndReviewsSevice.getSummary(summary);
	}

	
}
