package com.example.studyJpa2.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@ToString
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String userId;

    @Setter
    @Column(nullable = false)
    private String userPass;

    @Setter
    @Column(nullable = false)
    private String name;

    @Setter
    private int age;

    @Setter
    private String email;

    @Setter
    private String address;

    @Setter
    private LocalDate birthDate;

    @Setter
    private String tel;

    @Setter
    private LocalDate joinDateTime;


}
