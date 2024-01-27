package com.suhitomi.angulartest.service;

import com.suhitomi.angulartest.entity.Order;
import com.suhitomi.angulartest.entity.User;
import com.suhitomi.angulartest.repository.OrderRepository;
import com.suhitomi.angulartest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
