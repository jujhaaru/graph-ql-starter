package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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

    private String id;
    private String authorName;
    private int age;
    private String writesIn;
    private List<Post> posts;

}
