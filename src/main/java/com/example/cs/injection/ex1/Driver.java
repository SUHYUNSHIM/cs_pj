package com.example.cs.injection.ex1;

public class Driver {  //운전자가 자동차를 생산한다. 자동차는 내부적으로 타이어를 생산한다.
    public static void main(String[] args){
        Car car = new Car(); // 운전자는 자동차를 사용한다. Car가 정확히 어떤 Tire를 쓰는지 알아야 객체 생성.
        System.out.println(car.getTireBrand());
    }
}
