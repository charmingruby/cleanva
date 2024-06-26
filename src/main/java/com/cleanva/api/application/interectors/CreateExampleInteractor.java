package com.cleanva.api.application.interectors;

import com.cleanva.api.application.gateways.ExampleGateway;
import com.cleanva.api.application.usecases.CreateExampleUseCase;
import com.cleanva.api.domain.entity.Example;

public class CreateExampleInteractor implements CreateExampleUseCase {
    private ExampleGateway exampleGateway;

    public CreateExampleInteractor(ExampleGateway exampleGateway) {
        this.exampleGateway = exampleGateway;
    }

    @Override
    public Example createExample(Example example) {
        return exampleGateway.createExample(example);
    }
}
