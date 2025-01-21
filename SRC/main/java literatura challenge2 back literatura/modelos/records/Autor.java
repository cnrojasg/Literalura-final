package SRC.main.java literatura challenge2 back literatura.modelos.records;

public package com.literatura.challenge_2_back_literatura.models.records;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Autor(
    @JsonAlias("name") String nombre,
    @JsonAlias("birth_year") Integer cumpleanios,
    @JsonAlias("death_year") Integer fechaFallecimiento
) {
} {
    
}
