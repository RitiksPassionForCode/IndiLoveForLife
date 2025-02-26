package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    Long id;
    User user;
    List<OrderItem> items;
    Double totalPrice;
    String status; // Pending, Shipped, Delivered, Canceled
    LocalDateTime orderDate;
}

