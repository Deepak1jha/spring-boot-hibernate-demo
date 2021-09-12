package com.hibernet.hibernet;

import com.hibernet.hibernet.model.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernetApplication {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session =factory.openSession();
        try {
            Student student = new Student("Deepak","Delhi");
            session.beginTransaction();
//            session.save(student);
            List<Student> studentList = session.createQuery("from  student_details ").list();
            session.getTransaction().commit();

        }finally {
            factory.close();
        }

    }

}
