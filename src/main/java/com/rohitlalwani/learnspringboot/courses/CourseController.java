package com.rohitlalwani.learnspringboot.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohitlalwani.learnspringboot.courses.bean.Course;

@RestController
class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "dummy"),
				new Course(2, "Learn Microservices", "dummy"));
	}

	@GetMapping("/courses/1")
	public Course getCourseDetail() {
		return new Course(1, "Learn Microservices", "dummy");
	}
}
