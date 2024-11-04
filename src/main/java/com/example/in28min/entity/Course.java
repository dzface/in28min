package com.example.in28min.entity;

public class Course {
    private long id;
    private String name;
    private String author;
    // 필수 구현 항목 Constructor, Getter, toString


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
    public String toString(){
        return "Course [id=" + id + ", name=" + name +", author=" + author + "]";
    }
}
