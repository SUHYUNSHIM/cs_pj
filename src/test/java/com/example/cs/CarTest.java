package com.example.cs;

import com.example.cs.injection.ex1.KoreaTire;
import com.example.cs.injection.ex1.Tire;
import com.example.cs.injection.ex2.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void create(){
        Tire tire = new KoreaTire();
        Car car = new Car(tire);
        assertEquals("value : ",car.getTireBrand());
    }
}
