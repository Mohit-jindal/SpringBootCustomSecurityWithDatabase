package com.infotech.app.dao;

import java.util.List;

import com.infotech.app.entities.Topic;

public interface TopicDAO {

	public Topic getTopicById(int topicId);
	public List<Topic> getAllTopics();
	public void addTopic(Topic topic);
	public void updateTopic(Topic topic);
	public void deleteTopic(int topicId);
	public boolean topicExists(String title, String category);
}
