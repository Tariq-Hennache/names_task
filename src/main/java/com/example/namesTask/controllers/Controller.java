package com.example.namesTask.controllers;

import com.example.namesTask.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greetings")

public class Controller {

    @GetMapping
    public Greeting getGreetings(){
        return new Greeting("Jim", "afternoon");
    }


}
