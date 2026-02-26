package com.example.PassbookApp.index.Entity;

public record RegisterForm(
        int totalAmount,
        int targetAmount,
        int difference
) {
    public RegisterEntity registerEntity(){
        return new RegisterEntity(
                null,totalAmount(),targetAmount(),difference()
        );
    }
}
