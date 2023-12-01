package com.example.SpringBoot.SpringBoot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	
	@RequestMapping("/course")
	public String couse() {
		System.out.println("done working");
		return "course.jsp";
	}

}
