package com.example.allinworks.module.board.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter @Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BOARD")
public class Board {
    @Id
    @Column(name = "BOARD_NO", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userNo;

//    @ManyToOne // 변경해야 할 수도 있다.
    @JoinColumn(name = "DEPT_NO", nullable = false)
    private String deptNo;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

}
