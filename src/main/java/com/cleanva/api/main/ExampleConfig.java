package com.cleanva.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cleanva.api.application.gateways.ExampleGateway;
import com.cleanva.api.application.interectors.CreateExampleInteractor;
import com.cleanva.api.infrastructure.dto.CreateExampleDTOMapper;
import com.cleanva.api.infrastructure.gateways.ExampleEntityMapper;
import com.cleanva.api.infrastructure.gateways.ExampleRepositoryGateway;
import com.cleanva.api.infrastructure.persistence.ExampleRepository;

@Configuration
public class ExampleConfig {
    @Bean
    CreateExampleInteractor createExampleUseCase(ExampleGateway exampleGateway) {
        return new CreateExampleInteractor(exampleGateway);
    }

    @Bean
    ExampleGateway exampleGateway(ExampleRepository exampleRepository, ExampleEntityMapper exampleEntityMapper) {
        return new ExampleRepositoryGateway(exampleRepository, exampleEntityMapper);
    }

    @Bean
    ExampleEntityMapper exampleEntityMapper() {
        return new ExampleEntityMapper();
    }

    @Bean
    CreateExampleDTOMapper createExampleDTOMapper() {
        return new CreateExampleDTOMapper();
    }
}
