package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class User {
    Long id;
    String name;
    String email;
    String password;
    String phoneNumber;
    String address;
    String role; // CUSTOMER, ADMIN
    List<Order> orders;
}
