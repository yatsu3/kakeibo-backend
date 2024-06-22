package com.example.kakeibo.domain;
import lombok.Data;

@Data
public class Greeting {
    private final String name;
    private final int age;

    public Greeting(String name, int age) {
		this.name = name;
		this.age = age;
	}
}