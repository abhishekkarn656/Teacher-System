package com.abhi.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.demo.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
