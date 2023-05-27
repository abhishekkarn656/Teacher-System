package com.abhi.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhi.demo.Model.Student;
import com.abhi.demo.Model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	/*
	 * @Query("Insert into course(id,scourse,sid,tid) select s.sid,s.course,s.sid,t.tid from student s inner join teacher t ON s.course=t.course"
	 * ) public List<Teacher> findStudentByTeacher();
	 */

}
