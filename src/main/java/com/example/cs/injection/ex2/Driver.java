package com.example.cs.injection.ex2;

import com.example.cs.injection.ex1.KoreaTire;
import com.example.cs.injection.ex1.Tire;

public class Driver { //운전자가 타이어를 생산한다. 운전자가 자동차를 생산하면서 타이어를 장착한다.
    public static void main(String[] args){
        Tire tire = new KoreaTire(); //인터페이스 구현 객체를 받는다. +확장성.
        //Tire tire = new HankookTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
//생성 시에 의존성 주입시, 한 번 주입 시 더이상 교체 방법이 없음. 운전자가 원할 떄 타이어교체.
//Tire 구현체 - 전략 / Car의 getTireBrand 메서드 - 컨택스트 / Driver의 main 메서드 - 클라이언트.
