//package com.example.myapp.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "AdminUsers")
//public class AdminUser extends User {
//
//  private AdminLevel adminLevel;
//
//  public AdminUser(Integer userId, String userName, String password, String phone, String email,
//      com.example.myapp.models.Address address, AdminLevel adminLevel) {
//    super(userId, userName, password, phone, email, address);
//    this.adminLevel = adminLevel;
//  }
//
//  public AdminUser(String userName, String password, String phone, String email,
//      com.example.myapp.models.Address address, AdminLevel adminLevel) {
//    super(userName, password, phone, email, address);
//    this.adminLevel = adminLevel;
//  }
//
//  public AdminLevel getAdminLevel() {
//    return adminLevel;
//  }
//
//  public void setAdminLevel(AdminLevel adminLevel) {
//    this.adminLevel = adminLevel;
//  }
//}
