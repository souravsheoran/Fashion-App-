package com.example.Fashion.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    private List<String> options;

    // Getters and Setters
}