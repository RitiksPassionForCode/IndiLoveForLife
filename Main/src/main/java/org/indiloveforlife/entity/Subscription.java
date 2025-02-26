package org.indiloveforlife.entity;

import javax.persistence.Entity;

@Entity
public class Subscription {
    Long id;
    String name; // Example: "Weekly Plan", "3-Month Plan", "6-Month Plan"
    String description; // Additional details about the plan
    int durationInDays; // 7 for a week, 90 for 3 months, 180 for 6 months
    Double price;
    Boolean isActive;
}
