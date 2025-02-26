package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class UserSubscription {
    Long id;
    User user;
    Subscription plan;
    LocalDateTime startDate;
    LocalDateTime endDate;
    LocalDateTime gracePeriodEndDate; // Expiry + Grace period (e.g., 3 days)
    String status; // Active, Expired, Canceled
    Boolean autoRenewal;
    Payment payment;
    Boolean isRefundProcessed;
    Boolean hasDamagedProduct; // if Damaged
}
