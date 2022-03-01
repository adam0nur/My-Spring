package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        // this will contain 2 oe more class that we can access and use the other functions
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);
        
            FullTimeMentor fullTimeMentor=applicationContext.getBean(FullTimeMentor.class);
            fullTimeMentor.createAccount();

        // if we put an annotation @Primary we do not have to put  //@Bean(name = "partTimeMentor1")

        // and we do no have to put like getBean("partTimeMentor2",PartTimeMentor.class);

            PartTimeMentor partTimeMentor=applicationContext.getBean("partTimeMentor2",PartTimeMentor.class);
            partTimeMentor.createAccount();


            String str=applicationContext.getBean(String.class);
            System.out.println("str = " + str);


    }

}
