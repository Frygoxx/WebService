package com.gA.gAAcademy.francotercero.webservices.webServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	
	
}
