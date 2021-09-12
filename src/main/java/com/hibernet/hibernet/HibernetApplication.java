package com.hibernet.hibernet;

import com.hibernet.hibernet.model.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernetApplication.class, args);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Student student = new Student("name","Delhi",22);
		System.out.println(student);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
 	}

}
