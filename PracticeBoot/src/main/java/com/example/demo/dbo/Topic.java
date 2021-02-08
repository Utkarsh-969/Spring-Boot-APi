package com.example.demo.dbo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String TopicId;
	private String TopicName;
	private String TopicDescription;
	
	
	
	public String getTopicId() {
		return TopicId;
	}

	public Topic(int id,String topicId, String topicName, String topicDescription) {
		super();
		this.id = id;
		TopicId = topicId;
		TopicName = topicName;
		TopicDescription = topicDescription;
	}

	public void setTopicId(String topicId) {
		TopicId = topicId;
	}

	public String getTopicName() {
		return TopicName;
	}

	public void setTopicName(String topicName) {
		TopicName = topicName;
	}

	public String getTopicDescription() {
		return TopicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		TopicDescription = topicDescription;
	}

	public Topic() {
		// TODO Auto-generated constructor stub
	}

}
