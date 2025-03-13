package com.example.MySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Ứng dụng đang chạy...");
		Thread.currentThread().join(); // Giữ chương trình chạy
	}

}
