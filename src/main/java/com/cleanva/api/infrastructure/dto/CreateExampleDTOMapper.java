package com.cleanva.api.infrastructure.dto;

import com.cleanva.api.domain.entity.Example;

public class CreateExampleDTOMapper {
    public CreateExampleResponseDTO toResponse(Example example) {
        return new CreateExampleResponseDTO(example.name());
    }

    public Example toUser(CreateExampleRequestDTO request) {
        return new Example(request.name(), request.description());
    }
}
