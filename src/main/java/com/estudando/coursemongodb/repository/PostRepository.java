package com.estudando.coursemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudando.coursemongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
