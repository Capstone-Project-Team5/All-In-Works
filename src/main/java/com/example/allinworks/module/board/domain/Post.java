package com.example.allinworks.module.board.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    private String postNo;

    private String boardNo;

    private String userNo;

    private String fileNo;

    private String content;

    private int views;
    
    private LocalDate createdAt;

    private LocalDate updatedAt;

}
