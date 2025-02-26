package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Product {
    Long id;
    String name;
    String description;
    Double price;
    String size; // S, M, L, XL
    String color;
    String category; // Men's, Women's, Kids
    int stock;
    List<String> images;
    Double rating;
}
