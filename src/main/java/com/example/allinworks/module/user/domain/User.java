package com.example.allinworks.module.user.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_INFO")
public class User {
    @Id
    @Column(name = "USER_NO", nullable = false, length = 10)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userNo;

    @Column(name = "DEPT_NO", nullable = false, length = 10)
    private String deptNo;

    @Column(name = "USER_NAME", nullable = false, length = 20)
    private String userName;

    @Column(name = "USER_PW")
    private String userPw;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "CONTACT", length = 15)
    private String contact;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "POSITION", nullable = false)
    private String position;

    @Column(name = "HIRE_DATE", nullable = false)
    private LocalDate hireDate;

}