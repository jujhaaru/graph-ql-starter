package com.poc.graphql.service.impl;

import com.poc.graphql.dao.entity.Author;
import com.poc.graphql.dao.entity.Post;
import com.poc.graphql.dao.repository.AuthorRepository;
import com.poc.graphql.dao.repository.PostRepository;
import com.poc.graphql.service.AuthorService;
import com.poc.graphql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostServiceImpl implements PostService {

    @Autowired(required = true)
    private PostRepository postRepository;


    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }
}
