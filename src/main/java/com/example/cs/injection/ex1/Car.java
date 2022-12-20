package com.example.cs.injection.ex1;

public class Car {
    Tire tire;
    public Car(){
        tire = new KoreaTire();  //의존관계가 일어나는 부분.new가 붙은 부분에 의존한다. 자동차가 tire에 의존하고 있음.
        //tire = new HankookTire();
        /*자동차 내부에서 타이어를 생산한다는 것이 문제. 해결하기 위해 외부에서 생성된 것을 주입하려고 한다.*/
    }
    public String getTireBrand(){
        return "result " + tire.getBrand();
    }

}
