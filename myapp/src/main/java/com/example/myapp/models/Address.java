package com.example.myapp.models;

import javax.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer addressId;

  private String Street1;
  private String Street2;
  private String City;
  private String State;
  private String ZipCode;

  @OneToOne
  private User user;

  @OneToOne
  private Restaurant restaurant;

  public Address(String street1, String street2, String city, String state, String zipCode, User user) {
    Street1 = street1;
    Street2 = street2;
    City = city;
    State = state;
    ZipCode = zipCode;
    this.user = user;
  }

  public Address(Integer addressId, String street1, String street2, String city, String state, String zipCode, User user) {
    this.addressId = addressId;
    Street1 = street1;
    Street2 = street2;
    City = city;
    State = state;
    ZipCode = zipCode;
    this.user = user;
  }

  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public String getStreet1() {
    return Street1;
  }

  public void setStreet1(String street1) {
    Street1 = street1;
  }

  public String getStreet2() {
    return Street2;
  }

  public void setStreet2(String street2) {
    Street2 = street2;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public String getState() {
    return State;
  }

  public void setState(String state) {
    State = state;
  }

  public String getZipCode() {
    return ZipCode;
  }

  public void setZipCode(String zipCode) {
    ZipCode = zipCode;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
