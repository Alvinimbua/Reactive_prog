package com.imbuka.reactive.repository;

import com.imbuka.reactive.entity.Developer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface DeveloperRepository extends ReactiveCrudRepository<Developer, Integer> {


    Flux<Developer> findAllByFirstnameIgnoreCase(String firstname);

}
