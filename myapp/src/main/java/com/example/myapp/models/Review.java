package com.example.myapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer reviewId;

  private Timestamp timestamp;
  private String Review;
  private float Rating;

  @ManyToOne
  @JsonIgnore
  private Customer customer;

  @ManyToOne
  @JsonIgnore
  private Restaurant Restaurant;

  public Review(Timestamp timestamp, String review, float rating,
      com.example.myapp.models.Customer customer,
      com.example.myapp.models.Restaurant restaurant) {
    this.timestamp = timestamp;
    Review = review;
    Rating = rating;
    this.customer = customer;
    Restaurant = restaurant;
  }

  public Review(Integer reviewId, Timestamp timestamp, String review, float rating,
      com.example.myapp.models.Customer customer,
      com.example.myapp.models.Restaurant restaurant) {
    this.reviewId = reviewId;
    this.timestamp = timestamp;
    Review = review;
    Rating = rating;
    this.customer = customer;
    Restaurant = restaurant;
  }

  public Review() {
  }

  public Integer getReviewId() {
    return reviewId;
  }

  public void setReviewId(Integer reviewId) {
    this.reviewId = reviewId;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public String getReview() {
    return Review;
  }

  public void setReview(String review) {
    Review = review;
  }

  public float getRating() {
    return Rating;
  }

  public void setRating(float rating) {
    Rating = rating;
  }

  public com.example.myapp.models.Customer getCustomer() {
    return customer;
  }

  public void setUser(com.example.myapp.models.Customer customer) {
    this.customer = customer;
  }

  public com.example.myapp.models.Restaurant getRestaurant() {
    return Restaurant;
  }

  public void setRestaurant(com.example.myapp.models.Restaurant restaurant) {
    Restaurant = restaurant;
  }
}
