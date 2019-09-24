package com.poc.graphql.service.impl;

import com.poc.graphql.dao.entity.Language;
import com.poc.graphql.dao.repository.LanguageRepo;
import com.poc.graphql.service.LanguageService;
import com.poc.graphql.utilities.NextSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired(required = true)
    private LanguageRepo languageRepo;

    @Autowired
    private NextSequenceService nextSequence;

    @Override
    @Transactional(readOnly = true)
    public List<Language> getAllLanguages(int count) {
        List<Language> allLanguages = new ArrayList<>();
        Iterable<Language> langIterable = this.languageRepo.findAll();
        langIterable.forEach(allLanguages::add);
        return allLanguages;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Language> getLanguage(String id) {
        return languageRepo.findById(id);
    }
    @Override
    @Transactional
    public Language addLanguage(final String name){
        Language lang=new Language();
        lang.setName(name);
        lang.setId(nextSequence.getNextSequences("langSequence"));
        languageRepo.save(lang);
        return lang;
    }

}
