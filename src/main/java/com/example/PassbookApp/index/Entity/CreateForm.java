package com.example.PassbookApp.index.Entity;

public record CreateForm(
    String category,
    String method,
    int amount,
    String cont,
    String memo
) {
    public CreateEntity createEntity(){
        return new CreateEntity
                (null,Category.valueOf(category()),Method.valueOf(method()),amount(),Continue.valueOf(cont()),memo());
    }


}
