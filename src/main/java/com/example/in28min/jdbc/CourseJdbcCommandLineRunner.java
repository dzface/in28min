package com.example.in28min.jdbc;

import com.example.in28min.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//CommandLineRunner를 구현설정하면 프로그램 시작하면서 작동함
//run 메서드를 반드시 구현해주어야 함
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception { // 지금 테이블에 데이터를 삽입하는 코드인데 테이블이 생성되어있지 않으면 오류발생
        repository.insert(new Course(1, "Learn AWS Basic","in28minutes"));
        repository.insert(new Course(2, "Learn Python Basic","in28minutes"));
        repository.insert(new Course(3, "Learn React Basic","in28minutes"));


        repository.deleteById(1);

    }
}
