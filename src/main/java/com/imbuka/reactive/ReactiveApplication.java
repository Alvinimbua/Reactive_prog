package com.imbuka.reactive;

import com.imbuka.reactive.entity.Developer;
import com.imbuka.reactive.service.DeveloperService;
import com.imbuka.reactive.service.impl.DeveloperServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            DeveloperService developerService
    ) {
        return args -> {
            for(int i = 0; i < 100; i++) {
                developerService.save(
                        Developer.builder()
                                .firstname("Alvin" + i)
                                .lastname("Azorian" + i)
                                .age(i)
                                .build()
                ).subscribe();
            }
        };
    }

}
