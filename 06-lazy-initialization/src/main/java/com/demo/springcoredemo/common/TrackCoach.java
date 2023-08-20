package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy // marks the bean as lazy-initialized
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
