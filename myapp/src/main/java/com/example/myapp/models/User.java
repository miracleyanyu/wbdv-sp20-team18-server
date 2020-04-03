package com.example.myapp.models;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;

  private String userName;
  private String firstName;
  private String lastName;
  private String Password;
  private String Phone;
  private String Email;

  private String Address;

  public User(Integer userId, String userName, String firstName, String lastName, String password, String phone, String email,
      String address) {
    this.userId = userId;
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    Password = password;
    Phone = phone;
    Email = email;
    Address = address;
  }

  public User(String userName, String firstName, String lastName, String password, String phone, String email,
      String address) {
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    Password = password;
    Phone = phone;
    Email = email;
    Address = address;
  }

  public User() {
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String phone) {
    Phone = phone;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
