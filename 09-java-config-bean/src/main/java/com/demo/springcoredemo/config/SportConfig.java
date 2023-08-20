package com.demo.springcoredemo.config;

import com.demo.springcoredemo.common.Coach;
import com.demo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // the bean id now
    public Coach swimCoach() { // the method name is the bean id
        return new SwimCoach(); // because the SwimCoach doesn't have the @Component annotation, we need to create a bean for it
    }
}
