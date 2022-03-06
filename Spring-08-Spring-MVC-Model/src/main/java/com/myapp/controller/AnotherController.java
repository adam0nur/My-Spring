package com.myapp.controller;


import com.myapp.Model.Mentor;
import com.myapp.enums.Gender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list")     // localhost:8080/another/list
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Nurshat","Naibi",45, Gender.MALE));
        mentorList.add(new Mentor("Ako","Abu",65, Gender.MALE));
        mentorList.add(new Mentor("Adam","Nur",25, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";


    }
}
