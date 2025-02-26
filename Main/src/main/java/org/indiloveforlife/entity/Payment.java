package org.indiloveforlife.entity;

import java.time.LocalDateTime;

public class Payment {
    Long id;
    User user;
    Order order;
    String paymentMethod; // Credit Card, UPI, Wallet
    String status; // Success, Failed, Pending
    LocalDateTime paymentDate;
}
