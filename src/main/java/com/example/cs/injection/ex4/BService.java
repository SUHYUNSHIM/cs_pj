package com.example.cs.injection.ex4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//
@Service
@Qualifier("BService")
public class BService implements SampleService{
    @Override
    public String getValue() {
        return "B";
    }
}
