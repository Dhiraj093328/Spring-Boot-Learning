package com.waghmare.dhiraj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.waghmare.dhiraj.dao.Student;

@Controller
public class StudentController {

	@RequestMapping("/Student")
	public ModelAndView getStudent(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student");
		List<Student> l1 = new ArrayList<Student>();
		Student s1 = new Student(101, "Ram", 35);
		Student s2 = new Student(101, "Ram", 35);
		Student s3 = new Student(101, "Ram", 35);
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		mv.addObject("studentlist", l1);
		return mv;
	}

}
