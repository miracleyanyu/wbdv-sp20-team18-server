package com.example.myapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Payments")
public class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer paymentId;

  private String paymentType;
  private String cardType;
  private String cardHolderName;
  private Date expirationDate;
  private Integer securityCode;

  @ManyToOne
  private Customer customer;

  public Payment(String paymentType, String cardType, String cardHolderName,
      Date expirationDate, Integer securityCode, Customer customer) {
    this.paymentType = paymentType;
    this.cardType = cardType;
    this.cardHolderName = cardHolderName;
    this.expirationDate = expirationDate;
    this.securityCode = securityCode;
    this.customer = customer;
  }

  public Payment(Integer paymentId, String paymentType, String cardType, String cardHolderName,
      Date expirationDate, Integer securityCode, Customer customer) {
    this.paymentId = paymentId;
    this.paymentType = paymentType;
    this.cardType = cardType;
    this.cardHolderName = cardHolderName;
    this.expirationDate = expirationDate;
    this.securityCode = securityCode;
    this.customer = customer;
  }

  public Payment() {
  }

  public Integer getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Integer paymentId) {
    this.paymentId = paymentId;
  }

  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Integer getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(Integer securityCode) {
    this.securityCode = securityCode;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
