package com.cleanva.api.infrastructure.gateways;

import com.cleanva.api.domain.entity.Example;
import com.cleanva.api.infrastructure.persistence.ExampleEntity;

public class ExampleEntityMapper {
    ExampleEntity toEntity(Example exampleDomainObj) {
        return new ExampleEntity(exampleDomainObj.name(), exampleDomainObj.description());
    }

    Example toDomainObj(ExampleEntity exampleEntity) {
        return new Example(exampleEntity.getName(), exampleEntity.getDescription());
    }
}
