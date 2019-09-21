package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Post implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String title;
    private int likes;
    private String comments;
    private Language lang;
}
