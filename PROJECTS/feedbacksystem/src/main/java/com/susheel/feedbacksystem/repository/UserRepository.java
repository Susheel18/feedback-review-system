package com.susheel.feedbacksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susheel.feedbacksystem.entity.User;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

}