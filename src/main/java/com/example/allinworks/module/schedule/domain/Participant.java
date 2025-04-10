package com.example.allinworks.module.schedule.domain;

import com.example.allinworks.module.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int participantNo;

    @ManyToOne
    @JoinColumn(name = "schedule_no")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
}
