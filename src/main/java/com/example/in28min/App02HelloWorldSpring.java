package com.example.in28min;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // SPRING BOOT 동작 방식
        // JVM이 실행되면 하부에 SPRING BOOT context가 실행됨
        // context를 생성해주어야 함 Spring container Spring context, IOC Container 모두 동일한 뜻
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiiguration.class);
        // Spring boot가 대상들을 관리하도록 설정 @Configuration 클래스 사용
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("getAddress"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person4Qualifier"));
        // 해당 context에 있는 빈 이름 모두 출력하는 방법
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
