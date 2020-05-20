package com.estudando.coursemongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.coursemongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User(null, "Maria Aranha", "maria@gmail.com");
		User u2 = new User(null, "Lucas Aranha", "lucas@gmail.com");
		User u3 = new User(null, "Renato Aranha", "renato@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(u1, u2, u3));
		return ResponseEntity.ok().body(list);
	}
}
