package com.example.cs.injection.ex2;

import com.example.cs.injection.ex1.Tire;

public class Car {
    Tire tire; //의존성을 갖던 것

    /*생성자*/
    public Car(Tire tire){ //인자로
        this.tire = tire;
    }
    public String getTireBrand(){
        return "result " + tire.getBrand();
    }

}
