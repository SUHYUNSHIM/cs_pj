package com.example.cs.injection.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    /* 필드 주입
    편함.
    * */
/*
    @Qualifier("AService")
    @Autowired
    private SampleService sampleService;*/

    /* 생성자. 생성자가 하나만 있으면 autowired 생략 가능. 생성자 하나에 주입이라면. 필수적으로 주입을 받아야 인스턴스 생성 가능.
    final 키워드 사용 가능. 데이터 누락 시 컴파일 오류. 한번 의존 관계가 주입되면 변할 일이 없음.
    * */
/*
    private final SampleService sampleService;
    @Autowired
    SampleController(@Qualifier("BService") SampleService sampleService) {   //.
        this.sampleService = sampleService;
    }
*/


/*    setter : setter 쓸 때는 final 안씀. setter 메서드를 public으로 해야함.
    외부에서 변경 가능. 주입받는 객체가 변경될 가능성 있는 경우에 사용하면 된다.*/
/*
    private SampleService sampleService;
    @Autowired
    public void setSampleService(@Qualifier("AService") SampleService sampleService){
        this.sampleService = sampleService;
    }
*/


/*    @PostMapping(value="/testValue")
    public String getSampleValueReturn(){
        return this.sampleService.getValue();
    }*/
}
