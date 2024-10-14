package com.example.Fashion.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private double originalPrice;
    private int discountPercentage;
    private String imageUrl;
    private int timestamp;
    private String currency;
    private boolean inStock;

    @ManyToOne
    private Video video;

    @ManyToOne
    private Store store;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Variant> variants;

    // Getters and Setters
}