package com.example.PassbookApp.index.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record RegisterEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        int totalAmount,
        int targetAmount,
        int difference
) {
}
