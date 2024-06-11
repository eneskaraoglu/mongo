package com.ek.mongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ek.mongo.models.ListingsAndReviewsModel;


public interface ListingsAndReviewsRepository extends MongoRepository<ListingsAndReviewsModel,String>{


public List<ListingsAndReviewsModel> findByName(String name);

@Query("{ 'description': { $regex: ?0, $options: 'i' } }")
public List<ListingsAndReviewsModel> findByDescriptionLike(String description);

@Query("{ 'summary': { $regex: ?0, $options: 'i' } }")
public List<ListingsAndReviewsModel> findBySummaryLike(String summary);

List<ListingsAndReviewsModel> findBySummaryRegex(String summary);

}
