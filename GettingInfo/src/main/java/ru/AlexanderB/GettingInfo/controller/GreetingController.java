package ru.AlexanderB.GettingInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.AlexanderB.GettingInfo.Converter;

import java.io.IOException;
import java.util.Map;

@Controller
public class GreetingController {

    Converter converter=new Converter();

    @GetMapping("/greeting")
    public String greeting( Map<String, Object> model) {
       // model.put("name", name);
        return "greeting";
    }




    @GetMapping
    public String main( Map<String, String> model) throws IOException {
        model.put("someInMain", converter.jpgToBase64());
                return "main";
    }

//    @GetMapping
//    public String main( Map<String, Object> model) {
//        model.put("someInMain", "Hello Everyone!");
//        return "main";
//    }
//
//      @GetMapping("/login")
//    public String login( Map<String, Object> model) {
//        model.put("someInLogin", "Its Login page!");
//        return "login";
//    }
//    @GetMapping("/error")
//    public String error(@RequestParam(name="name", required=false, defaultValue=".") String name, Model model) {
//        model.addAttribute("name", name);
//        return "error";
//    }
}