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

  @OneToMany(mappedBy = "order")
  private List<Item> items;

  private Date shippedOn;
  private Address shipTo;
  private double Total;

  @ManyToOne
  @JsonIgnore
  private Customer customer;

  @ManyToOne
  @JsonIgnore
  private Restaurant restaurant;

  private OrderStatus orderStatus;

  public Order(Date orderOn, List<Item> items, Date shippedOn,
      Address shipTo, double total, Customer customer, Restaurant restaurant,
      OrderStatus orderStatus) {
    this.restaurant = restaurant;
    this.orderOn = orderOn;
    this.items = items;
    this.shippedOn = shippedOn;
    this.shipTo = shipTo;
    Total = total;
    this.customer = customer;
    this.orderStatus = orderStatus;
  }

  public Order(Integer orderId, Date orderOn, List<Item> items, Date shippedOn,
      Address shipTo, double total, Customer customer, Restaurant restaurant,
      OrderStatus orderStatus) {
    this.restaurant = restaurant;
    this.orderId = orderId;
    this.orderOn = orderOn;
    this.items = items;
    this.shippedOn = shippedOn;
    this.shipTo = shipTo;
    Total = total;
    this.customer = customer;
    this.orderStatus = orderStatus;
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

  public Address getShipTo() {
    return shipTo;
  }

  public void setShipTo(Address shipTo) {
    this.shipTo = shipTo;
  }

  public double getTotal() {
    return Total;
  }

  public void setTotal(double total) {
    Total = total;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }
}
