package com.imbuka.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "developers")
public class Developer {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
}
