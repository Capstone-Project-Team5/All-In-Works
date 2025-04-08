package com.example.allinworks.module.approval.repository;

import com.example.allinworks.module.approval.domain.ApprovalDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalRepository extends JpaRepository<ApprovalDoc, Integer> {
}
