package com.estudando.coursemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudando.coursemongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}
