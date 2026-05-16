package com.susheel.feedbacksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susheel.feedbacksystem.entity.Feedback;
import com.susheel.feedbacksystem.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/save")
    public Feedback saveFeedback() {

        Feedback feedback = new Feedback();

        feedback.setTitle("Teaching Review");
        feedback.setDescription("Faculty teaching was very good");
        feedback.setRating(5);
        feedback.setCategory("Teaching");

        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/all")
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable Long id) {
        return feedbackService.getFeedbackById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteFeedback(@PathVariable Long id) {
        return feedbackService.deleteFeedback(id);
    }
}