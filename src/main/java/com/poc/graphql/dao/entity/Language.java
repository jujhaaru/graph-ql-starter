package com.poc.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Language implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String name;
}
