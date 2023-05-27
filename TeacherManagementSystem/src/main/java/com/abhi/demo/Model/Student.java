package com.abhi.demo.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Sid;
	private String Firstname;
	private String Lastname;
	private String gender;
	private String Course;
	/*
	 * @OneToMany private List<Course> courses;
	 */
	
	@ManyToMany(mappedBy = "students")
	private Set<Teacher> teachers= new HashSet<>();

	public Long getSid() {
		return Sid;
	}

	public void setSid(Long sid) {
		Sid = sid;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", gender=" + gender
				+ ", Course=" + Course + ", teachers=" + teachers + "]";
	}

	public Student(Long sid, String firstname, String lastname, String gender, String course, Set<Teacher> teachers) {
		super();
		Sid = sid;
		Firstname = firstname;
		Lastname = lastname;
		this.gender = gender;
		Course = course;
		this.teachers = teachers;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	

	
	
	
}
	
