package com.aqa.asavostytskyi.springdi.controllers;

import com.aqa.asavostytskyi.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greeting;

    public void setGreeting(GreetingService greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting.sayGreeting();
    }
}
