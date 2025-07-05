package com.pricecompare.pricecompare_new.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String imageUrl;
    private int amazonPrice;
    private int flipkartPrice;
    private int snapdealPrice;

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getAmazonPrice() { return amazonPrice; }
    public void setAmazonPrice(int amazonPrice) { this.amazonPrice = amazonPrice; }

    public int getFlipkartPrice() { return flipkartPrice; }
    public void setFlipkartPrice(int flipkartPrice) { this.flipkartPrice = flipkartPrice; }

    public int getSnapdealPrice() { return snapdealPrice; }
    public void setSnapdealPrice(int snapdealPrice) { this.snapdealPrice = snapdealPrice; }
}