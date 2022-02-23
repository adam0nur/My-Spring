package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigCar.class);

        Car car=applicationContext.getBean(Car.class);
        System.out.println("car.getMake() = " + car.getMake());


        Person person=applicationContext.getBean(Person.class);
        System.out.println("person.getName() = " + person.getName());

        System.out.println("person = " + person.getCar());

        System.out.println("person = " + person.getCar().getMake());




    }



}
