package com.example.in28min.repository;

import com.example.in28min.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
}
