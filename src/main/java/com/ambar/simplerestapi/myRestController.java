package com.ambar.simplerestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {
    @GetMapping("/chat")
    public String chatWithAjay(){
        return "Hi Ajay ? How are you ? Your wife is settled now in UK ? Wish Her very good Luck !!! \n" +
                "This is my First Spring Boot Rest Api ! ";
    }
}
