package com.cleanva.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.cleanva.api.model.Example;

public interface ExampleRepository extends CrudRepository<Example, Long> {
}
