package com.kuldeepghorpade.journal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check")
    public String healtchrcking(){
        return "working fine";
    }
}
