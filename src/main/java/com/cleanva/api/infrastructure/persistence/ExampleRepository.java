package com.cleanva.api.infrastructure.persistence;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface ExampleRepository extends CrudRepository<ExampleEntity, UUID> {
}
