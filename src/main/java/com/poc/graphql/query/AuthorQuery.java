package com.poc.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.poc.graphql.dao.entity.Author;
import com.poc.graphql.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    @Autowired(required=true)
    private AuthorService authService;

    public Optional<Author> checkAuthor(final String id){
        return this.authService.checkAuthor(id);
    }

    public String  sayHello(final String name){
        return  "hello "+name;

    }
}
