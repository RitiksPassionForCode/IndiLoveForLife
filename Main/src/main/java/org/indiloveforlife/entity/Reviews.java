package org.indiloveforlife.entity;

import java.time.LocalDateTime;

public class Reviews {
    Long id;
    User user;
    Product product;
    int rating; // 1-5
    String comment;
    LocalDateTime reviewDate;
}
