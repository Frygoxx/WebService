package com.gA.gAAcademy.francotercero.webservices.webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gA.gAAcademy.francotercero.webservices.webServices.entity.Topic;
import com.gA.gAAcademy.francotercero.webservices.webServices.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@PostMapping("/topic")
	public  Topic createTopic (@RequestBody Topic inputTopic){
		Topic returnTopic = topicService.createTopic(inputTopic);
		
		
		return null;
	}
}