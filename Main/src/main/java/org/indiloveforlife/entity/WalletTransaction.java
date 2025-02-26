package org.indiloveforlife.entity;

import java.time.LocalDateTime;

public class WalletTransaction {
    Long id;
    Wallet wallet;
    Double amount;
    String type; // DEPOSIT, PURCHASE, REFUND, WITHDRAWAL
    String status; // SUCCESS, FAILED, PENDING
    LocalDateTime transactionDate;
}
