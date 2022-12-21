package com.example.cs;

import com.example.cs.injection.ex4.SampleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsApplication {
    public static void main(String[] args) {
            SpringApplication.run(CsApplication.class, args);
    }
}
