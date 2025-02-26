package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class WishList {
    Long id;
    User user;
    List<Product> products;
}
