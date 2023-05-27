package com.abhi.demo.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Tid;
	private String Firstname;
	private String Lastname;
	private String gender;
	private String Course;
	private int experince;
	
	@ManyToMany()
	@JoinTable(name="Teacher_student",
	joinColumns = @JoinColumn(name="teacher_id",referencedColumnName = "Tid"),
	inverseJoinColumns = {@JoinColumn(name="student_id",referencedColumnName = "Sid")})
	private Set<Student> students;

	public Long getTid() {
		return Tid;
	}

	public void setTid(Long tid) {
		Tid = tid;
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

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [Tid=" + Tid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", gender=" + gender
				+ ", Course=" + Course + ", experince=" + experince + ", students=" + students + "]";
	}

	public Teacher(Long tid, String firstname, String lastname, String gender, String course, int experince,
			Set<Student> students) {
		super();
		Tid = tid;
		Firstname = firstname;
		Lastname = lastname;
		this.gender = gender;
		Course = course;
		this.experince = experince;
		this.students = students;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	
	
	
	
	
}
	