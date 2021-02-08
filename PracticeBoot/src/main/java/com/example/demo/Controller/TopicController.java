package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dbo.Topic;
import com.example.demo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicServ;
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/addTopic")
	public void addTopic(@RequestBody Topic topic) {		
		topicServ.addTopic(topic);		
	}
	
	@RequestMapping(value= "/api/getAllTopic")
	public List<Topic> getAllTopics() {
		return topicServ.getTopic();
	}
	
	@RequestMapping(value= "/api/getTopicById/{topicId}")
	public Optional<Topic> getTopicsbyId(@PathVariable("topicId") int topicId) {
		return topicServ.getTopicByTopicId(topicId);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/api/updateTopic")
	public void updateTopic(@RequestBody Topic topic) {		
		topicServ.updateTopic(topic);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/api/deleteTopic/{topicId}")
	public void deleteTopic(@PathVariable("topicId") int topicId) {		
		topicServ.deleteTopic(topicId);		
	}
	
	public TopicController() {
		// TODO Auto-generated constructor stub
	}

}
