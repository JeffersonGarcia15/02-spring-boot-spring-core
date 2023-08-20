package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // marks the class as the primary bean when there are multiple beans of the same type
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
