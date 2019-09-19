package com.poc.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.poc.graphql.dao.entity.Language;
import com.poc.graphql.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class LanguageQuery implements GraphQLQueryResolver {

    @Autowired(required = true)
    private LanguageService langService;

    public Optional<Language> getLanguage(final String id) {
        return langService.getLanguage(id);
    }

    public List<Language> getAllLanguages(final int count) {
        //This will give count of languages from top
        return langService.getAllLanguages(count);
    }

}
