package com.gA.gAAcademy.francotercero.webservices.webServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/topic/{id}")
	public Topic getTopicById(@PathVariable int id){
		Topic topic = topicService.getTopicById(id);
		return topic;
	} 
	
	@PutMapping("/topic/{id}")
		public Topic updateTopic(@PathVariable int id, @RequestBody Topic updateTopic) {
		Topic topic = topicService.updateTopic(id, updateTopic);
		return topic;
	}
	@DeleteMapping("/topic/{id}")
		public ResponseEntity<?> deleteTopic(@PathVariable int id){
			int idToDelete = topicService.deleteTopicFis(id);
			String a = "El topic:" + idToDelete + "fue borrado exitosamente";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}
	@DeleteMapping("topic/logic/{id}")
	public ResponseEntity<?> deleteLogicTopic(@PathVariable int id){
		int fueBorrado = topicService.deleteLogicTopic(id);
		if(fueBorrado > 0) {
			String msg = "El topic ID: "+ fueBorrado + "fue borrado exitosamente";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("No pudo ser borrado",HttpStatus.NOT_FOUND);

	}	
	
}
	
