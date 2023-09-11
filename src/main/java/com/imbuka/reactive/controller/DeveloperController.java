package com.imbuka.reactive.controller;

import com.imbuka.reactive.entity.Developer;
import com.imbuka.reactive.service.DeveloperService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService){
        this.developerService = developerService;
    }

    @PostMapping
    Mono<Developer> save(@RequestBody Developer developer) {
        return developerService.save(developer);
    }

    @GetMapping
    Flux<Developer> findAll() {
        return developerService.findAll();
    }

    @GetMapping("/{id}")
    Mono<Developer> findById(@PathVariable("id") Integer id) {
       return developerService.findById(id);
    }
}
