package com.demo.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // marks the class as a Java bean(a regular Java class managed by Spring) and makes it available for dependency injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // this will create a new instance of the bean every time it is requested
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
