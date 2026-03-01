package com.example.PassbookApp.index.Entity;

public record RegisterForm(
        Integer targetAmount
) {
    public RegisterEntity registerEntity(int totalAmount,int difference){
        return new RegisterEntity(
                null,totalAmount,targetAmount(),difference
        );
    }
}
