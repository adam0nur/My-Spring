package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassApp {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigApp.class);
       Java java= applicationContext.getBean(Java.class);
        java.getTeachingHours();

    }
}
