package com.example.allinworks.module.project.domain;

import com.example.allinworks.module.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "PROJECT")  // 테이블명 명시 (대문자 테이블명이면 이대로)
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @Column(name = "PROJECT_NO", nullable = false, length = 10)
    private int projectNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @Column(name = "TITLE", length = 30)
    private String title;
}

