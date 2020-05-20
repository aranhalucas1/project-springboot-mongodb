package com.estudando.coursemongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudando.coursemongodb.domain.User;
import com.estudando.coursemongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		User u1 = new User(null, "Lucas Aranha", "lucinhas@gmail.com");
		User u2 = new User(null, "Renato Aranha", "renato@gmail.com");
		User u3 = new User(null, "Liciane Aranha", "liciane@gmail.com");
		
		repository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
