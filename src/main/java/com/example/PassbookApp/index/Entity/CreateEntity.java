package com.example.PassbookApp.index.Entity;


import java.awt.*;


public record CreateEntity(
        Long id,
        Category category,
        Method method,
        int amount,
        Continue Continue,
        TextArea memo
) {
}
