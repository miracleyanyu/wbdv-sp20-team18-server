//package com.example.myapp.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Items")
//public class Item {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Integer itemId;
//
//  private String itemName;
//  private double price;
//  private Integer quality;
//
//  public Item(String itemName, double price, Integer quality) {
//    this.itemName = itemName;
//    this.price = price;
//    this.quality = quality;
//  }
//
//  public Item(Integer itemId, String itemName, double price, Integer quality) {
//    this.itemId = itemId;
//    this.itemName = itemName;
//    this.price = price;
//    this.quality = quality;
//  }
//
//  public Item() {
//  }
//
//  public Integer getItemId() {
//    return itemId;
//  }
//
//  public void setItemId(Integer itemId) {
//    this.itemId = itemId;
//  }
//
//  public String getItemName() {
//    return itemName;
//  }
//
//  public void setItemName(String itemName) {
//    this.itemName = itemName;
//  }
//
//  public double getPrice() {
//    return price;
//  }
//
//  public void setPrice(double price) {
//    this.price = price;
//  }
//
//  public Integer getQuality() {
//    return quality;
//  }
//
//  public void setQuality(Integer quality) {
//    this.quality = quality;
//  }
//}
