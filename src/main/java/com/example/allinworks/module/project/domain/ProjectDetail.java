package com.example.allinworks.module.project.domain;

import com.example.allinworks.module.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "PROJECT_DETAIL")
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetail {
    @Id
    @Column(name = "DETAIL_NO", nullable = false, length = 10)
    private int detailNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @ManyToOne
    @JoinColumn(name = "project_no")
    private Project project;

    @Column(name = "SUBJECT", nullable = false, length = 50)
    private String subject;

    @Column(name = "PART")
    private String part;

    @Column(name = "START_DATE", nullable = false)
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "STATUS")
    private String status;
}
