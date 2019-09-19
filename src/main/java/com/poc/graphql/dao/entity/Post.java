package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Post implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String title;
    private int likes;
    private String comments;
    private Language lang;
}
