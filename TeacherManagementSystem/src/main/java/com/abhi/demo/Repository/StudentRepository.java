package com.abhi.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.demo.Model.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}
