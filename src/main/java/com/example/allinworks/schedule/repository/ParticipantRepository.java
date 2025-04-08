package com.example.allinworks.schedule.repository;

import com.example.allinworks.schedule.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
