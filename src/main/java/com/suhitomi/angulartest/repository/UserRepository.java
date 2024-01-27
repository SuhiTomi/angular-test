package com.suhitomi.angulartest.repository;

import com.suhitomi.angulartest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, Integer> {
}
