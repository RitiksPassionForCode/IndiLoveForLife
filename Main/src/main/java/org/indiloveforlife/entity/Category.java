package org.indiloveforlife.entity;

import jdk.jfr.Enabled;

import java.util.List;

@Enabled
public class Category {
    Long id;
    String name; // Example: Shirts, Pants, Dresses
    List<Product> products;
}
