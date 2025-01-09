package com.suturn.domain.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private float price;
    private int stock_quantity;
    private String category;
}
