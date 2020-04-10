//package com.example.myapp.models;
//
//import java.util.List;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Menus")
//public class Menu {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private Integer menuId;
//
//  @OneToOne
//  private Restaurant restaurant;
//
//  @OneToMany
//  @JoinColumn(name = "menu_id")
//  private List<Item> items;
//
//  public Menu(List<Item> items) {
//    this.items = items;
//  }
//
//  public Menu(Integer menuId, List<Item> items) {
//    this.items = items;
//    this.menuId = menuId;
//  }
//
//  public Menu() {
//  }
//
//  public Integer getMenuId() {
//    return menuId;
//  }
//
//  public void setMenuId(Integer menuId) {
//    this.menuId = menuId;
//  }
//
//  public List<Item> getItems() {
//    return items;
//  }
//
//  public void setItems(List<Item> items) {
//    this.items = items;
//  }
//
//  public void addItems(Item item) {
//    if (!getItems().contains(item)) {
//      getItems().add(item);
//    }
//  }
//}
