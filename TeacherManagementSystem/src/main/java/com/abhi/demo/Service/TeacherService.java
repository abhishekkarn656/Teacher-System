package com.abhi.demo.Service;

import java.util.List;

import com.abhi.demo.Model.Student;
import com.abhi.demo.Model.Teacher;

public interface TeacherService {
	
	public List<Teacher> getAll();
	public Teacher getTeacher(long Teacherid);
	public Teacher addTeacher(Teacher teacher);
	public Teacher updateTeacher(Teacher teacher);
	public void  deleteTeacher(long Teacherid);
	public void addTeacherToStudent(Long TeacherId,Long StudentId);
	public List<Teacher> findStudentByTeacher();
}
