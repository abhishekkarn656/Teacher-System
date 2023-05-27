package com.abhi.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhi.demo.Model.Student;
import com.abhi.demo.Service.StudnetService;

@Controller
public class StudentController {
	@Autowired
	private StudnetService studentService;
	@GetMapping("/students")
	public String getAll(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return"students_form";
		
	}
	
	@GetMapping("/students/new")
	public String createform(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_from";
	}
	@PostMapping("/students")
	public String savestudent(@ModelAttribute("student")Student student) {
		studentService.savestudent(student);
		return"redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editstudent(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_from";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student, Model model) {
		Student es=studentService.getStudentById(id);
		es.setFirstname(student.getFirstname());
		es.setLastname(student.getLastname());
		es.setGender(student.getGender());
		es.setCourse(student.getCourse());
		
		studentService.savestudent(es);
		return"redirect:/students";
		
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deletestudentById(id);
		return"redirect:/students";
		
	}
	@GetMapping("/views")
	public String getStudenttoTeacher(Model model) {
		return"Courses";
	}
	

}
