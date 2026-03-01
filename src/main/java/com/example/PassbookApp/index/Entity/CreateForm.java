package com.example.PassbookApp.index.Entity;

import jakarta.validation.constraints.NotNull;

public record CreateForm(
    @NotNull
    String category,
    @NotNull
    String method,
    int amount,
    @NotNull
    String cont,
    String memo
) {
    public CreateEntity createEntity(){
        return new CreateEntity
                (null,Category.valueOf(category()),Method.valueOf(method()),amount(),Continue.valueOf(cont()),memo());
    }


}
