package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Cart {
    Long id;
    User user;
    List<CartItem> items;
    Double totalPrice;
}

