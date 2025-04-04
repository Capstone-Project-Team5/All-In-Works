package com.example.allinworks.module.approval.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.thymeleaf.spring6.processor.SpringUErrorsTagProcessor;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalLine {
    @Id
    private int lineNo;
    private String userNo;
    private int approvalOrder;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime approvedAt;

}
