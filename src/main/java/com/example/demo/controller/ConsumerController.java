package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ConsumerController {

	String ConsumerUri = "https://api.first.org/data/v1/news";
		
	private RestTemplate template;
	
	@GetMapping
	public Response consumeService() throws JsonMappingException, JsonProcessingException {
		
		template = new RestTemplate();
		  
		ResponseEntity<String> result = template.getForEntity(ConsumerUri, String.class);
		String reponseBody = result.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		// Parsing response body string to Response DTO class.
		Response reponse = mapper.readValue(reponseBody, Response.class);
				
		// No need of sorting here because the data came from service is in sorted format. 
		return reponse;
	}
	
}
