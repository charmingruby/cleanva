package com.cleanva.api.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleanva.api.application.usecases.CreateExampleUseCase;
import com.cleanva.api.domain.entity.Example;
import com.cleanva.api.infrastructure.dto.CreateExampleDTOMapper;
import com.cleanva.api.infrastructure.dto.CreateExampleRequestDTO;
import com.cleanva.api.infrastructure.dto.CreateExampleResponseDTO;

@RestController
@RequestMapping("/api/examples")
public class ExampleController {
    private final CreateExampleUseCase createExampleUseCase;
    private final CreateExampleDTOMapper createExampleDTOMapper;

    public ExampleController(CreateExampleUseCase createExampleUseCase, CreateExampleDTOMapper createExampleDTOMapper) {
        this.createExampleUseCase = createExampleUseCase;
        this.createExampleDTOMapper = createExampleDTOMapper;
    }

    @PostMapping
    CreateExampleResponseDTO create(@RequestBody CreateExampleRequestDTO request) {
        Example exampleBusinessObj = this.createExampleDTOMapper.toUser(request);
        Example example = this.createExampleUseCase.createExample(exampleBusinessObj);
        return this.createExampleDTOMapper.toResponse(example);
    }
}