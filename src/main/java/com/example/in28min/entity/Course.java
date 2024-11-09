package com.example.in28min.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    // 테이블 생성을 위한 클래스는 getter constructor toString 이 필요
    @Id
    private long id;
    private String name;
    private String author;
    // 필수 구현 항목 Constructor, Getter, toString
    // 추가적으로 데이터 수정이 필요할때 setter도 구현해야함

    public Course(){}
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "Course [id=" + id + ", name=" + name +", author=" + author + "]";
    }
}
