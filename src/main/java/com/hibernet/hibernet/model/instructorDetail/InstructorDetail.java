package com.hibernet.hibernet.model.instructorDetail;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "hobby")
    private String hobby;
    @Column(name = "youtube_channel")
    private String youtube;

    public InstructorDetail(String hubby, String youtube) {
        this.hobby = hubby;
        this.youtube = youtube;
    }
}
