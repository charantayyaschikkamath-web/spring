package com.example.lecture93;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture93Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Lecture93Application.class, args);
        PaymentService p=context.getBean(PaymentService.class);
        p.pay();




	}

}
