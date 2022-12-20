package com.example.cs.injection.ex4;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
class SampleController {

    @Qualifier("AService")
    @Autowired
    private SampleService sampleService;
    String sampleValue;

    /* 생성자 : spring 버전 4부터는 autowired 생략 가능. 생성자 하나에 주입이라면. 필수적으로 주입을 받아야 인스턴스 생성 가능.
    순환 참조를 방지할 수 있다. final로 선언
    * */
/*    @Autowired
    SampleController(@Qualifier("BService") SampleService sampleService) {   //.
        this.sampleService = sampleService;
        this.sampleValue = this.sampleService.getValue();
    }*/

/*
    public SampleController(@Qualifier("AService") SampleService sampleService){
        this.sampleService = sampleService;
    }*/


/*    setter : setter 쓸 때는 final 안씀. setter 메서드를 public으로 해야함.
    외부에서 변경 가능. 주입받는 객체가 변경될 가능성 있는 경우에 사용하면 된다.*/
/*    @Autowired
    public void setSampleService(@Qualifier("AService") SampleService sample){
        sampleService = sample;
        this.sampleValue = sampleService.getValue();
    }

    public String getSampleValue() {
        return this.sampleValue;
    }*/
}
