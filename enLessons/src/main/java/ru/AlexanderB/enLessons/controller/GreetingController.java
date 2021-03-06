package ru.AlexanderB.enLessons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting( Map<String, Object> model) {
       // model.put("name", name);
        return "greeting";
    }


    @GetMapping("/main")
    public String main( Map<String, Object> model) {
        model.put("someInMain", "Hello Everyone!");
        return "main";
    }


}