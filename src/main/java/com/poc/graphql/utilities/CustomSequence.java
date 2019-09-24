package com.poc.graphql.utilities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequences")
@Data
@NoArgsConstructor
public class CustomSequence {

    @Id
    private String id;
    private Long seq;

}
