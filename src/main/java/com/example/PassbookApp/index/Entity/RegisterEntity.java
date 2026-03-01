package com.example.PassbookApp.index.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        private Integer totalAmount;
        private Integer targetAmount;
        private Integer difference;
}

