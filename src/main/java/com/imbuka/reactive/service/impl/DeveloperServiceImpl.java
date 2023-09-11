package com.imbuka.reactive.service.impl;

import com.imbuka.reactive.entity.Developer;
import com.imbuka.reactive.repository.DeveloperRepository;
import com.imbuka.reactive.service.DeveloperService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository developerRepository;

    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public Mono<Developer> save(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Flux<Developer> findAll() {
        return developerRepository.findAll()
                .delayElements(Duration.ofSeconds(1));
    }

    @Override
    public Mono<Developer> findById(Integer id) {
        return developerRepository.findById(id);
    }

}
