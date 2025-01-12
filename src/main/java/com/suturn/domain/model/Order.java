package com.suturn.domain.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Order {
    private String id;
    private List<Product> orderItems;
    private float totalPrice;
    private String address;
}
