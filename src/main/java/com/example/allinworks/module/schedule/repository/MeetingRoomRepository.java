package com.example.allinworks.module.schedule.repository;

import com.example.allinworks.module.schedule.domain.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Integer> {

}
