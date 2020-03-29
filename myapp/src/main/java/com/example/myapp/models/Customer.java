package com.example.myapp.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer extends User {

  private UserLevel userLevel;

  @OneToMany(mappedBy = "customer")
  private List<Review> Reviews;

  @OneToMany(mappedBy = "customer")
  private List<Order> orders;

  @OneToMany(mappedBy = "customer")
  private List<Payment> payments;

  public Customer(Integer userId, String userName, String password, String phone, String email,
      com.example.myapp.models.Address address, UserLevel userLevel, List<Order> orders, List<Review> Reviews, List<Payment> payments) {
    super(userId, userName, password, phone, email, address);
    this.userLevel = userLevel;
    this.Reviews = Reviews;
    this.payments = payments;
    this.orders = orders;
  }

  public Customer(String userName, String password, String phone, String email,
      com.example.myapp.models.Address address, UserLevel userLevel, List<Order> orders, List<Review> Reviews, List<Payment> payments) {
    super(userName, password, phone, email, address);
    this.userLevel = userLevel;
    this.Reviews = Reviews;
    this.payments = payments;
    this.orders = orders;
  }

  public UserLevel getUserLevel() {
    return userLevel;
  }

  public void setUserLevel(UserLevel userLevel) {
    this.userLevel = userLevel;
  }

  public List<Review> getReviews() {
    return Reviews;
  }

  public void setReviews(List<Review> reviews) {
    Reviews = reviews;
  }

  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }
}
