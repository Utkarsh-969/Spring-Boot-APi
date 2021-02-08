package com.example.demo.repoService;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dbo.Topic;

public interface TopicRepoService extends JpaRepository<Topic,Integer> {
			
	
}
