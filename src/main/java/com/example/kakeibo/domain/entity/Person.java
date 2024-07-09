package com.example.kakeibo.domain;
import lombok.Data;

@Data
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}