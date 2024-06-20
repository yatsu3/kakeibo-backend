package com.example.kakeibo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class KakeiboBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakeiboBackendApplication.class, args);
	}

}
