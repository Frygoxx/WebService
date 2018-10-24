package com.gA.gAAcademy.francotercero.webservices.webServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		Topic returnTopic = topicService.createTopic(inputTopic); //se guarda en return topic el como esta creado ese topic en el sistema
		return returnTopic;
	}
	
	@GetMapping("/topic")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	} 
}