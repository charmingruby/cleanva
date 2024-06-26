package com.cleanva.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleanva.api.dto.CreateExampleDTO;
import com.cleanva.api.model.Example;
import com.cleanva.api.service.ExampleService;

@RestController
@RequestMapping("/api/examples")
public class ExampleController {
    private ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    Example create(@RequestBody CreateExampleDTO dto) {
        return exampleService.create(dto);
    }
}
