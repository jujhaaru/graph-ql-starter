package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Language implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
}
