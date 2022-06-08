package com.guigascourse.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigascourse.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> fidnAll() {
		User u = new User(1L, "Jhon", "jhon@gmail.com", "6669999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
