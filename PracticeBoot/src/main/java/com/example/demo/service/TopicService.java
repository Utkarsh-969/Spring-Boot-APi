package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dbo.Topic;
import com.example.demo.repoService.TopicRepoService;

@Service
public class TopicService {
	@Autowired
	TopicRepoService trs;
	public TopicService() {
		// TODO Auto-generated constructor stub
	}
	
	public void addTopic(Topic topic) {
		trs.save(topic);
	}
	
	public List<Topic> getTopic() {
		List<Topic> tp= new ArrayList<Topic>();
	 trs.findAll().forEach(tp::add);
	 return tp;
	}
	
	public Optional<Topic> getTopicByTopicId(int topicId) {
		
		return trs.findById(topicId);
	}
	
	public void updateTopic(Topic topic) {
		trs.save(topic);
	}
	
	public void deleteTopic(int topicId) {
		trs.deleteById(topicId);
	}
	

}
