package com.example.cs.injection.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }
}
