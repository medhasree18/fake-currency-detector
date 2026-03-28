package com.currencydetection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.currencydetection.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}