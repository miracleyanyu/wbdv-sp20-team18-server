//package com.example.myapp.models;
//
//import java.util.List;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Restaurants")
//public class Restaurant {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Integer restaurantId;
//
//  private String Name;
//  private String Description;
//  private String listedHours;
//  private boolean isActive;
//
//  @OneToOne
//  private Address Address;
//
//  @OneToMany(mappedBy = "Restaurant")
//  private List<Review> Reviews;
//
//  @OneToMany(mappedBy = "restaurant")
//  private List<Order> orders;
//
//  private CuisineType cuisineType;
//
//  private String Type;
//
//  public Restaurant(String name, String description, String listedHours, boolean isActive,
//      com.example.myapp.models.Address address, String type, List<Review> Reviews, List<Order> orders, CuisineType cuisineType) {
//    Name = name;
//    Description = description;
//    this.listedHours = listedHours;
//    this.isActive = isActive;
//    Address = address;
//    Type = type;
//    this.Reviews = Reviews;
//    this.orders = orders;
//    this.cuisineType = cuisineType;
//  }
//
//  public Restaurant(Integer restaurantId, String name, String description, String listedHours, boolean isActive,
//      com.example.myapp.models.Address address, String type, List<Review> Reviews, List<Order> orders, CuisineType cuisineType) {
//    this.restaurantId = restaurantId;
//    Name = name;
//    Description = description;
//    this.listedHours = listedHours;
//    this.isActive = isActive;
//    Address = address;
//    Type = type;
//    this.Reviews = Reviews;
//    this.orders = orders;
//    this.cuisineType = cuisineType;
//  }
//
//  public Restaurant() {
//  }
//
//  public Integer getRestaurantId() {
//    return restaurantId;
//  }
//
//  public void setRestaurantId(Integer restaurantId) {
//    this.restaurantId = restaurantId;
//  }
//
//  public String getName() {
//    return Name;
//  }
//
//  public void setName(String name) {
//    Name = name;
//  }
//
//  public String getDescription() {
//    return Description;
//  }
//
//  public void setDescription(String description) {
//    Description = description;
//  }
//
//  public String getListedHours() {
//    return listedHours;
//  }
//
//  public void setListedHours(String listedHours) {
//    this.listedHours = listedHours;
//  }
//
//  public boolean isActive() {
//    return isActive;
//  }
//
//  public void setActive(boolean active) {
//    isActive = active;
//  }
//
//  public com.example.myapp.models.Address getAddress() {
//    return Address;
//  }
//
//  public void setAddress(com.example.myapp.models.Address address) {
//    Address = address;
//  }
//
//  public String getType() {
//    return Type;
//  }
//
//  public void setType(String type) {
//    Type = type;
//  }
//
//  public List<Review> getReviews() {
//    return Reviews;
//  }
//
//  public void setReviews(List<Review> reviews) {
//    Reviews = reviews;
//  }
//
//  public CuisineType getCuisineType() {
//    return cuisineType;
//  }
//
//  public void setCuisineType(CuisineType cuisineType) {
//    this.cuisineType = cuisineType;
//  }
//
//  public List<Order> getOrders() {
//    return orders;
//  }
//
//  public void setOrders(List<Order> orders) {
//    this.orders = orders;
//  }
//
//  public void addOrders(Order order) {
//    if (!getOrders().contains(order)) {
//      getOrders().add(order);
//    }
//  }
//
//  public void addReviews(Review review) {
//    if (!getReviews().contains(review)) {
//      getReviews().add(review);
//    }
//  }
//}
