package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired // tells Spring to inject the dependency.
    // if you only have one constructor then @Autowired is optional
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

/*
            /dailyWorkout ->              getDailyWorkout() ->
 Web browser                DemoController                    Coach
          <- "Practice fast..."                          <- "Practice fast..."
 */

// Web browser calls dailyworkout -> talks to our DemoController -> DemoController calls the Coach to getDailyWorkout
