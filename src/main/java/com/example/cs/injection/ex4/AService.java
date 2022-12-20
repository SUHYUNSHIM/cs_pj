package com.example.cs.injection.ex4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("AService")
public class AService implements SampleService{
    @Override
    public String getValue() {
        return "A";
    }
}
