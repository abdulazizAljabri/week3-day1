package com.example.hw11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/Welcome")
public class WelcomeController {

    @GetMapping(path = "/name")
    public String name(){

        return " My name is : Abdulaziz ";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is : 23";
    }
    @GetMapping(path = "/check/status")
    public String check(){
        return "Everything OK ";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public String [] list(){
        String [] list = {"abdulaziz","ail ", "mohammed"};
        return list;
    }

}
