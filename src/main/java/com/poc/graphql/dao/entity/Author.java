package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Author implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String authorName;
    private int age;
    private List<Language> writesIn;
    private List<Post> posts;

}
