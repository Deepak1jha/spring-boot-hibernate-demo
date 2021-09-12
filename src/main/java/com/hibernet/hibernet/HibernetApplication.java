package com.hibernet.hibernet;

import com.hibernet.hibernet.model.instructor.Instructor;
import com.hibernet.hibernet.model.instructorDetail.InstructorDetail;
import com.hibernet.hibernet.model.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernetApplication {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.openSession();
        try {
            InstructorDetail instructorDetail = new InstructorDetail("watch youtube", "Youtube.com/axy");
            Instructor instructor = new Instructor("Deepak", "jha", "email", instructorDetail);
            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }

}
