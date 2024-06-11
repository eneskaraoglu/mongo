package com.ek.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ek.mongo.models.ListingsAndReviewsModel;
import com.ek.mongo.repositories.ListingsAndReviewsRepository;

@Service
public class ListingsAndReviewsService {

 @Autowired
 private ListingsAndReviewsRepository listingsAndReviewsRepository;

	@Transactional
	public List<ListingsAndReviewsModel> getSummary(String summary) {
		
        return listingsAndReviewsRepository.findBySummaryLike(summary);
		
	}
}
