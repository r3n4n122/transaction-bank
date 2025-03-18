package com.banking_system.service;
import java.time.OffsetDateTime;


public class TransactionService {
  private double balance;
  private OffsetDateTime date;

  public TransactionService(double balance, OffsetDateTime date) {
    this.balance = balance;
    this.date = date;
  }

}
