package com.example.demo.repoService;

import java.util.Collection;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dbo.Course;
@Repository
public interface CourseCustomRespository extends CrudRepository<Course, Integer> {

	
	List<Course> findByCourseName(String name);
}
