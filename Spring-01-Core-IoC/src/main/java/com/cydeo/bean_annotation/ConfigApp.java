package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    //@Bean(name = "partTimeMentor1")
    @Primary
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean(name = "partTimeMentor2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }

}
