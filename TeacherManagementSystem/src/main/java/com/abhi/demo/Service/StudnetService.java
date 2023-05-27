package com.abhi.demo.Service;

import java.util.List;

import com.abhi.demo.Model.Student;

public interface StudnetService {
List<Student> getAllStudents();
Student savestudent(Student student);
Student getStudentById(Long id);
Student updateStudent(Student student);
void deletestudentById(Long id);

}
