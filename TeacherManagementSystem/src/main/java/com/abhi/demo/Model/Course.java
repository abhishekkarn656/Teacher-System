package com.abhi.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="Sid")
	private Student student;
	@ManyToOne
	@JoinColumn(name="Tid")
	private Teacher teacher;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long id, Student student, Teacher teacher, String scourse) {
		super();
		this.id = id;
		this.student = student;
		this.teacher = teacher;
		Scourse = scourse;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", student=" + student + ", teacher=" + teacher + ", Scourse=" + Scourse + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getScourse() {
		return Scourse;
	}
	public void setScourse(String scourse) {
		Scourse = scourse;
	}
	private String Scourse;

}
