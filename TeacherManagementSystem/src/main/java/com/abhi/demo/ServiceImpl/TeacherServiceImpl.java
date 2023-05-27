package com.abhi.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.demo.Model.Student;
import com.abhi.demo.Model.Teacher;
import com.abhi.demo.Repository.StudentRepository;
import com.abhi.demo.Repository.TeacherRepository;
import com.abhi.demo.Service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	 private TeacherRepository Teacherrepository;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return Teacherrepository.findAll();
	}

	@Override
	public Teacher getTeacher(long Teacherid) {
		
		return Teacherrepository.findById(Teacherid).get();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return Teacherrepository.save(teacher);
		
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
		return Teacherrepository.save(teacher);
	}

	@Override
	public void deleteTeacher(long Teacherid) {
		// TODO Auto-generated method stub
		Teacherrepository.deleteById(Teacherid);
	}

	@Override
	public void addTeacherToStudent(Long TeacherId, Long StudentId) {
		// TODO Auto-generated method stub
		Teacher teacher=Teacherrepository.findById(TeacherId).orElseThrow();
		Student student=studentRepository.findById(StudentId).orElseThrow();
		teacher.getStudents().add(student);
		student.getTeachers().add(teacher);
		Teacherrepository.save(teacher);
		studentRepository.save(student);
	}

	@Override
	public List<Teacher> findStudentByTeacher() {
		// TODO Auto-generated method stub
		return Teacherrepository.findStudentByTeacher();
	}

	
	
	
	

}
