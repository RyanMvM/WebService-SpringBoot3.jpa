package com.websservices.ProjectDemo.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.websservices.ProjectDemo.Entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L, "maria", "mariaoo@gmaiç.com", "912416530", "12345"); 
		return ResponseEntity.ok().body(u); 
		
	} 

}
