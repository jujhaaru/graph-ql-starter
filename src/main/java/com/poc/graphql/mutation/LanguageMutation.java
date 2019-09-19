package com.poc.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.poc.graphql.dao.entity.Language;
import com.poc.graphql.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LanguageMutation implements GraphQLMutationResolver {

    @Autowired(required=true)
    private LanguageService langService;

    public Language addLanguage(final String name){
        //This will give count of languages from top
        return langService.addLanguage(name);
    }
}
