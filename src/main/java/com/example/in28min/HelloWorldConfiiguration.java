package com.example.in28min;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//recode를 앞에 쓰고 생성자를 적으면 겟터 셋터를 자동으로 생성해줌
// getter setter는 말그대로 객체에 대한 정보를 가져오거나 수정할때쓰는 메서드
record Person(String name, int ag, Address address) {};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiiguration {
    @Bean // Spring boot가 관리하는 객체 또는 메서드를 빈이라고 함
    public String name(){
        return "Ranga";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        var person = new Person("Ravi", 20, new Address("Sooteac","Guri"));
        return person;
    }
    //Person이라는 객체를 내보내는 메서드를 만드는데 기존에 있는 메서드를 쓰고 싶으면 해당하는 위치에 그 메서드를 적어주면 됨
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),getAddress());
    }
    @Bean // address를 호출하는 메서드가 여러개인경우 명시해줘야 하더라 .......
    public Person person3Parameter(String name, int age, @Qualifier("getAddress2") Address address){ //Person을 내보내려면 name, age address가 필요함
        return new Person(name, age, address);
    }

    //name을 통해 빈의 이름도 바꿀수가 있고 대신 getBean("바뀐이름")으로 불러와야 함
    @Bean(name = "getAddress")
    public Address getAddress(){
        var address = new Address("Topyung","Guri");
        return address;
    }
    @Bean(name = "getAddress2")
    public Address getAddress2(){
        var address = new Address("Inchang","Guri");
        return address;
    }
}
