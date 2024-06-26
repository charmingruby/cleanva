package com.cleanva.api.infrastructure.gateways;

import com.cleanva.api.application.gateways.ExampleGateway;
import com.cleanva.api.domain.entity.Example;
import com.cleanva.api.infrastructure.persistence.ExampleEntity;
import com.cleanva.api.infrastructure.persistence.ExampleRepository;

public class ExampleRepositoryGateway implements ExampleGateway {
    private final ExampleRepository exampleRepository;
    private final ExampleEntityMapper exampleEntityMapper;

    public ExampleRepositoryGateway(
            ExampleRepository exampleRepository,
            ExampleEntityMapper exampleEntityMapper) {
        this.exampleRepository = exampleRepository;
        this.exampleEntityMapper = exampleEntityMapper;
    }

    @Override
    public Example createExample(Example exampleDomainObj) {
        ExampleEntity exampleEntity = this.exampleEntityMapper.toEntity(exampleDomainObj);
        ExampleEntity savedObj = this.exampleRepository.save(exampleEntity);
        return this.exampleEntityMapper.toDomainObj(savedObj);
    }
}
