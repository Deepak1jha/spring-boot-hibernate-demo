package com.hibernet.hibernet.model.student;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "student_details")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String city;

    public Student( String name, String city) {
        this.name = name;
        this.city = city;
    }
}
