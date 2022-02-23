package com.cydeo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

//  //  @Autowired we can out here as field injection
//    OfficeHours officeHours;

    OfficeHours officeHours;

    @Autowired  //  or Constructor Injections
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
