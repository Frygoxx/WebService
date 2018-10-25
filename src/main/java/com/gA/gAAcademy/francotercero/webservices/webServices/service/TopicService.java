package com.gA.gAAcademy.francotercero.webservices.webServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.gA.gAAcademy.francotercero.webservices.webServices.entity.Topic;
import com.gA.gAAcademy.francotercero.webservices.webServices.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public Topic createTopic(Topic inputTopic) {
		Topic t = topicRepository.save(inputTopic);  // le decimos al repositorio que no sguarde esta variable, en esa variable tenemos el topic que nos pasa el parametro en el llamado
		return t;
	}
	public List<Topic> getTopics(){
		List<Topic> list = topicRepository.findAll();
		return list;
	}
	
	public Topic getTopicById(int id){
		Topic topic = topicRepository.findById(id).get();
		return topic;
	} 
	
	public Topic updateTopic(int id, Topic updateTopic) {
		Topic topic = topicRepository.findById(id).get();
		if (updateTopic.getAuthor() > 0) 
			topic.setAuthor(updateTopic.getAuthor());
		
		if (updateTopic.getTitle()!=null) 
			topic.setTitle(updateTopic.getTitle());
		
		if (updateTopic.getDescription()!=null)
			topic.setDescription(updateTopic.getDescription());
		
		topic = topicRepository.save(topic);
		
		return topic;
		
	}
}
