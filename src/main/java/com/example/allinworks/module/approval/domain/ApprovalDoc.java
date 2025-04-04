package com.example.allinworks.module.approval.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
@Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalDoc {
    @Id
    private int documentNo;
    private String userNo;
    private String fileNo;
    private String type;
    private String content;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
