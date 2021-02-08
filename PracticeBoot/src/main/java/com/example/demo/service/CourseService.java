package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dbo.Course;
import com.example.demo.dbo.Topic;
import com.example.demo.repoService.CourseCustomRespository;
import com.example.demo.repoService.CourseRepoService;

@Service
public class CourseService {
	@Autowired
	CourseRepoService crs;
	@Autowired
	CourseCustomRespository css;
	public CourseService() {
		// TODO Auto-generated constructor stub
	}

	public void addCourse(Course course,int topicId) {
		course.setTopic(new Topic(topicId,"","",""));
		crs.save(course);
	}
	
	public List<Course> getCourse() {
		List<Course> cs= new ArrayList<Course>();
	 crs.findAll().forEach(cs::add);
	 return cs;
	}
	
	public Optional<Course> getCourseByCourseId(int courseId) {
		
		return crs.findById(courseId);
	}
	
	public List<Course> getCourseByCourseDescription(String desc) {
		
		return css.findByCourseName(desc);
	}
	
	
	
	public void updateCourse(Course course,int topicId) {
		course.setTopic(new Topic(topicId,"","",""));
		crs.save(course);
	}
	
	public void deleteCourse(int courseId) {
		crs.deleteById(courseId);
	}
	
}
