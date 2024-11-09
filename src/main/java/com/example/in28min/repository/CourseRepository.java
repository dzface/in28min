package com.example.in28min.repository;

import com.example.in28min.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CourseRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }
    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
