package com.poc.graphql.service;

import com.poc.graphql.dao.entity.Language;

import java.util.List;
import java.util.Optional;

public interface LanguageService {


    List<Language> getAllLanguages(int count);

    Optional<Language> getLanguage(String id);

    public Language addLanguage(final String name);
}
