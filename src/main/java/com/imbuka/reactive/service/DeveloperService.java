package com.imbuka.reactive.service;

import com.imbuka.reactive.entity.Developer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DeveloperService {

    Flux<Developer> findAll();

    Mono<Developer> findById(Integer id);

    Mono<Developer> save(Developer developer);
}
