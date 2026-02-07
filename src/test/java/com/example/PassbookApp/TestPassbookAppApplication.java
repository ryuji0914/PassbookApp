package com.example.PassbookApp;

import org.springframework.boot.SpringApplication;

public class TestPassbookAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(PassbookAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
