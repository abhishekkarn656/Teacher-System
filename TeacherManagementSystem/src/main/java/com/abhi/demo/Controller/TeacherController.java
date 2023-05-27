package com.abhi.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.demo.Model.Teacher;
import com.abhi.demo.Service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	// Displaying homepage
	
	
	// get all the teacher 
	@GetMapping("/Teachers")
	public String getAll(Model model){
		model.addAttribute("teachers",teacherservice.getAll());
		return"Teachers_List";
	}
	@GetMapping("/Teachers/new")
	public String createTeacher(Model model) {
		Teacher teacher= new Teacher();
		model.addAttribute("teacher", teacher);
		return"Teacher_from";
	}
	@PostMapping("/Teachers")
	public String addTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherservice.addTeacher(teacher);
		return"redirect:/Teachers";
	}
	@GetMapping("/teachers/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("teacher",teacherservice.getTeacher(id));
		return"Teacheredit";
	}
	@PostMapping("/teachers/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("teacher") Teacher teacher,Model model) {
		Teacher tt=teacherservice.getTeacher(id);
		tt.setFirstname(teacher.getFirstname());
		tt.setLastname(teacher.getLastname());
		tt.setGender(teacher.getGender());
		tt.setCourse(teacher.getCourse());
		tt.setExperince(teacher.getExperince());
		// save data to database
		teacherservice.addTeacher(teacher);
		return"redirect:/Teachers";
	}
	@GetMapping("/teachers/{id}")
	public String deleteStudent(@PathVariable Long id) {
		teacherservice.deleteTeacher(id);
		return"redirect:/Teachers";
	}
	
	
	/*
	 * @GetMapping("/views") public String View(Model model) {
	 * model.addAttribute("view",teacherservice.findByStudentId()); return
	 * "StudentToTeacher"; }
	 */
	 
	
	

}
