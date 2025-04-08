package com.example.allinworks.module.approval.service;

import com.example.allinworks.module.approval.domain.ApprovalDoc;
import com.example.allinworks.module.approval.dto.DocDetail;
import com.example.allinworks.module.approval.dto.DocList;
import com.example.allinworks.module.approval.repository.ApprovalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApprovalService {
    private ApprovalRepository approvalRepository;

    public List<DocList> getAllDocList() {
        List<ApprovalDoc> docList = approvalRepository.findAll();

        return null;
    }

    public DocDetail getDocDetail(Integer docId) {
        return null;
    }
}
