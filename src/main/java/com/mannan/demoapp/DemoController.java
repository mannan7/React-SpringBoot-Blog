package com.mannan.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

        @GetMapping("/api/hello")
        public String hello() {
            return "Hello mate, the time now is " + new Date() + "\n";

    }
}
