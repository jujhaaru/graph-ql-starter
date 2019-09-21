package com.poc.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.poc.graphql.dao.entity.Author;
import com.poc.graphql.dao.entity.Language;
import com.poc.graphql.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    @Autowired(required = true)
    private AuthorService authorService;

    public Author addAuthor(final String authorName, final int age, final List<Language> writesIn) {
        Author author = new Author();
        author.setAge(age);
        author.setAuthorName(authorName);
        author.setWritesIn(writesIn);
        return this.authorService.addAuthor(author);
    }
}
