package com.tcf.product.Entity;

import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String base64Image; // Base64 Encoded Image
}
