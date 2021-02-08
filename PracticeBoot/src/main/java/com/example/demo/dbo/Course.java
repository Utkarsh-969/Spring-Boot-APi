package com.example.demo.dbo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	private int id;
	private String courseId;
	private String courseDescription;
	private String courseName;
	
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}


	
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	
	
	public String getCourseId() {
		return courseId;
	}

	
	public Course(String courseId, String courseDescription, String courseName , int topicId , int id) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.courseDescription = courseDescription;
		this.courseName = courseName;
		this.topic = new Topic(topicId,"","","");
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

}
