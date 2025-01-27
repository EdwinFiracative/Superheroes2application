package com.example.superheroesapplication2.antiHero.dto;

import java.util.UUID;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AntiHeroDto {

    @Getter
    private UUID id;

    @NotNull(message = "First Name is required")
    private String firstName;

    private String lastName;
    private String house;
    private String knownAs;

}