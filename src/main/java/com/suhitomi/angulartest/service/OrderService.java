package com.suhitomi.angulartest.service;

import com.suhitomi.angulartest.entity.Order;
import com.suhitomi.angulartest.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

}
