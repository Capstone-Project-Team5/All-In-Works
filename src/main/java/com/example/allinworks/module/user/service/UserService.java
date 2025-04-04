package com.example.allinworks.module.user.service;


import com.example.allinworks.module.user.domain.User;
import com.example.allinworks.module.user.dto.JoinUserRequest;
import com.example.allinworks.module.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public String joinUser(JoinUserRequest request) {
//        String userNo = "001";
        User user = User.builder()
                .userNo(UUID.randomUUID().toString().substring(0,6))
                .deptNo("0123")
                .userName(request.getUserName())
                .position(request.getPosition())
                .hireDate(LocalDate.now())
                .build();

        userRepository.saveAndFlush(user);
        return user.getUserNo();
    }
}
