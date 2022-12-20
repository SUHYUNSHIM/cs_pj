package com.example.cs.injection.ex3;

import com.example.cs.injection.ex1.KoreaTire;
import com.example.cs.injection.ex1.Tire;

public class Driver { // 운전자가 타이어를 생산한다. 운전자가 자동차를 생산한다, 운전자가 자동차에 타이어를 장착한다.
    public static void main(String[] args){
        Tire tire = new KoreaTire();

        Car car = new Car();
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}

//Tire 구현체 - 전략 / Car의 getTireBrand 메서드 - 컨택스트 / Driver의 main 메서드 - 클라이언트.
