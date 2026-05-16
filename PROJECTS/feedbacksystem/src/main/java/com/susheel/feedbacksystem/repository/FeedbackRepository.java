package com.susheel.feedbacksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.susheel.feedbacksystem.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}