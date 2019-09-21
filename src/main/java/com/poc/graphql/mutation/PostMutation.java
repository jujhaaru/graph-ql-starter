package com.poc.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.poc.graphql.dao.entity.Language;
import com.poc.graphql.dao.entity.Post;
import com.poc.graphql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMutation implements GraphQLMutationResolver {
    @Autowired
    private PostService postService;

    public Post addPost(final String title, final int likes, final String comment, Language lang){
        Post post =new Post();
        post.setComments(comment);
        post.setLang(lang);
        post.setLikes(likes);
        post.setTitle(title);
        return postService.addPost(post);
    }

}
