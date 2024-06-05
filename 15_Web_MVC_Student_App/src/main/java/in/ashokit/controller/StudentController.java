package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")//Get mapping is used to get the data from ui
	public String loadIndexPage(Model model) {
		init(model);
		return "index";//index is the view page
		
	}
	private void init(Model model) {
		Student sobj=new Student();
	
		model.addAttribute("student",sobj);
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("prefTimings",service.getTimings());
	}
	@PostMapping("/save")
	public String handleSubmitBtn(Student s,Model model) {
		
		boolean isSaved=service.saveStudent(s);
		//System.out.println(s);
		if(isSaved) {
		model.addAttribute("msg","Data saved....");
		}
		init(model);
		return "index";

	}
}