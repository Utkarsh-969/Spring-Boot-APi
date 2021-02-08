package com.example.demo.repoService;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dbo.Course;
@Repository
public  interface CourseRepoService extends JpaRepository<Course, Integer>{

	public List<Course> findByCourseDescription(String CourseDescription); 
	
	
}