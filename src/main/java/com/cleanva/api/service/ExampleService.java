package com.cleanva.api.service;

import org.springframework.stereotype.Service;

import com.cleanva.api.dto.CreateExampleDTO;
import com.cleanva.api.model.Example;
import com.cleanva.api.repository.ExampleRepository;

@Service
public class ExampleService {
    private ExampleRepository exampleRepository;

    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Example create(CreateExampleDTO dto) {
        Example example = new Example();
        example.setName(dto.name());
        example.setDescription(dto.description());

        return this.exampleRepository.save(example);
    }
}
