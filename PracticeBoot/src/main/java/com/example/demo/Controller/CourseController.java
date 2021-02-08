package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dbo.Course;
import com.example.demo.service.CourseService;
@RestController
public class CourseController {
	
	public CourseController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	CourseService CourseServ;
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/{topicId}/addCourse")
	public void addTopic(@RequestBody Course course,@PathVariable int topicId) {		
		CourseServ.addCourse(course,topicId);		
	}
	
	@RequestMapping(value= "/api/getAllCourse")
	public List<Course> getAllTopics() {
		return CourseServ.getCourse();
	}
	
	@RequestMapping(value= "/api/getCourseById/{courseId}")
	public Optional<Course> getTopicsbyId(@PathVariable("courseId") int courseId) {
		return CourseServ.getCourseByCourseId(courseId);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/api/{topicId}/updateCourse")
	public void updateTopic(@RequestBody Course course,@PathVariable int topicId) {		
		CourseServ.updateCourse(course,topicId);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/api/deleteCourse/{courseId}")
	public void deleteTopic(@PathVariable("courseId") int courseId) {		
		CourseServ.deleteCourse(courseId);		
	}
	
	@RequestMapping(value= "/api/getCourseByDescription/{couseDiscrption}")
	public List<Course> getTopicsbyId(@PathVariable("couseDiscrption") String couseDiscrption) {
		return CourseServ.getCourseByCourseDescription(couseDiscrption);
	}

}
