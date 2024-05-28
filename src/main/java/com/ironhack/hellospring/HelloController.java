package com.ironhack.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public Greet greet(@RequestParam(required = false) String name){
        var greet = new Greet();

        if (name!= null){
            greet.setGreet("Hello " + name);

        }
        else {
            greet.setGreet("Hello Spring");
        }

        return greet;
    }
}
