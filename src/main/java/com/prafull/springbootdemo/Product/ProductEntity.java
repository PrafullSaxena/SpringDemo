package com.prafull.springbootdemo.Product;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductEntity {

    private String productID;
    private String name;
    private float price;

    public ProductEntity() {
    }

    public ProductEntity(String name, float price) {
        this.productID = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
