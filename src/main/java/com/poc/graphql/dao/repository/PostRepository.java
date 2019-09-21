package com.poc.graphql.dao.repository;

import com.poc.graphql.dao.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
