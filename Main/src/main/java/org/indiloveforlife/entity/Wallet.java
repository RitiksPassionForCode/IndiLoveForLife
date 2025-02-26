package org.indiloveforlife.entity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Wallet {
    Long id;
    User user;
    Double balance;
    LocalDateTime lastUpdated;
}
