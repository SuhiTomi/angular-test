package com.suhitomi.angulartest.repository;

import com.suhitomi.angulartest.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface OrderRepository extends JpaRepository<Order, Integer> {

//    Page<Order> findByItemName(@Param("itemName") String itemName, Pageable pageable);

}
