package com.example.allinworks.module.approval.controller;

import com.example.allinworks.module.approval.dto.DocDetail;
import com.example.allinworks.module.approval.dto.DocList;
import com.example.allinworks.module.approval.service.ApprovalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller("/approval")
@AllArgsConstructor
public class ApprovalController {
    private ApprovalService approvalService;

    /**
     * 결재 문서 전체 리스트 조회
     */
    @GetMapping("/")
    public String docList(Model model) {
        List<DocList> documents;
        documents = approvalService.getAllDocList();
        model.addAttribute("documents", documents);
        return "approval/list";
    }


    /**
     * 결재 문서 개별 조회
     */
    @GetMapping("/detail/{docId}")
    public String docDetail(Model model, @PathVariable int docId) {
        DocDetail docDetail = approvalService.getDocDetail(docId);
        model.addAttribute("documents", docDetail);
        return "approval/docDetail";
    }


    /**
     * 결재 문서 생성
     */
    @PostMapping("/create")
    public String createDoc(Model model) {
        List<DocList> docList = new ArrayList<>();
        docList = approvalService.getAllDocList();
        model.addAttribute("documents", docList);
        return "approval/list";
    }


}
