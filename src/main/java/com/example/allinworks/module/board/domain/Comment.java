package com.example.allinworks.module.board.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private String commentNo;

    private String postNo;

    private String userNo;

    private String content;

    private LocalDate createdAt;

    private LocalDate updatedAt;

}
