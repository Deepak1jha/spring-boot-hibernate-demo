package com.hibernet.hibernet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernetApplication.class, args);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(sessionFactory);

	}

}
