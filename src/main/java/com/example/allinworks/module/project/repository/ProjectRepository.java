package com.example.allinworks.module.project.repository;

import com.example.allinworks.module.project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
