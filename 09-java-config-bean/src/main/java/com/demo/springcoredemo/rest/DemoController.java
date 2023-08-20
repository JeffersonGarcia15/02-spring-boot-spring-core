package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // constructor injection
    // Default scope is Singleton meaning that there is only one instance. All dependency injections for the bean will reference the same bean.
    @Autowired
    public DemoController(
            @Qualifier("aquatic") Coach theCoach
    ) { // you can name this method anything you want. What matters is the @Autowired annotation
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
