package com.tcf.order.model;

import lombok.Data;

@Data
public class ProductDTO {
    private Long productId;
    private String productName;
    private double price;
    private int quantity;
}