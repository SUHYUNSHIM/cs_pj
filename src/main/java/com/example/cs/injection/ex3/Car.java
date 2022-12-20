package com.example.cs.injection.ex3;

import com.example.cs.injection.ex1.Tire;

public class Car {
    //기본 생성자.

    Tire tire; //setter

    public Tire getTire(){return tire;}
    public void setTire(Tire tire){this.tire = tire;}

    public String getTireBrand(){
        return "Value : "+tire.getBrand();
    }
}
