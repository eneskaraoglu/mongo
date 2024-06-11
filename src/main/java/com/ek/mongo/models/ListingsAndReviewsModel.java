package com.ek.mongo.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "listingsAndReviews")
public class ListingsAndReviewsModel {
    
    @Id
    private String id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhood_overview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private Date last_scraped;
    private Date calendar_last_scraped;
    private Date first_review;
    private Date last_review;
    private int accommodates;
    private int bedrooms;
    private int beds;

}


