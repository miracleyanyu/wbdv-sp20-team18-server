package com.example.myapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer orderId;

  private Date orderOn;

  @OneToMany
  @JoinColumn(name = "order_id")
  private List<Item> items;

  private Date shippedOn;
  private double Total;

  @ManyToOne
  private Customer customer;

  @ManyToOne
  private Restaurant restaurant;

  private OrderStatus orderStatus;

  public Order(Date orderOn, List<Item> items, Date shippedOn, double total, OrderStatus orderStatus, Customer customer, Restaurant restaurant) {
    this.orderOn = orderOn;
    this.items = items;
    this.shippedOn = shippedOn;
    Total = total;
    this.orderStatus = orderStatus;
    this.customer = customer;
    this.restaurant = restaurant;
  }

  public Order(Integer orderId, Date orderOn, List<Item> items, Date shippedOn, double total, OrderStatus orderStatus, Customer customer, Restaurant restaurant) {
    this.orderId = orderId;
    this.orderOn = orderOn;
    this.items = items;
    this.shippedOn = shippedOn;
    Total = total;
    this.orderStatus = orderStatus;
    this.customer = customer;
    this.restaurant = restaurant;
  }

  public Order() {
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Date getOrderOn() {
    return orderOn;
  }

  public void setOrderOn(Date orderOn) {
    this.orderOn = orderOn;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Date getShippedOn() {
    return shippedOn;
  }

  public void setShippedOn(Date shippedOn) {
    this.shippedOn = shippedOn;
  }

  public double getTotal() {
    return Total;
  }

  public void setTotal(double total) {
    Total = total;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public void addItems(Item item) {
    if (!getItems().contains(item)) {
      getItems().add(item);
    }
  }
}
