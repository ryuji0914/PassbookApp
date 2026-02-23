package com.example.PassbookApp.index.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;
import java.awt.*;


public record CreateEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        Category category,
        Method method,
        int amount,
        Continue Continue,
        String memo
) {
}
