package com.example.superheroesapplication2.antiHero.service;

import java.util.UUID;

import com.example.superheroesapplication2.antiHero.entity.AntiHeroEntity;
import com.example.superheroesapplication2.exception.NotFoundException;
import com.example.superheroesapplication2.antiHero.repository.AntiHeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class AntiHeroService {

    private final AntiHeroRepository repo;

    public Iterable<AntiHeroEntity> findAllAntiHeroes() {
        return repo.findAll();
    }

    public AntiHeroEntity findAntiHeroById(UUID id) {
        return findOrThrow(id);
    }

    public void removeAntiHeroById(UUID id) {
        repo.deleteById(id);
    }

    public AntiHeroEntity addAntiHero(AntiHeroEntity antiHero) {
        return repo.save(antiHero);
    }

    public void updateAntiHero(UUID id, AntiHeroEntity antiHero) {
        findOrThrow(id);
        repo.save(antiHero);
    }

    private AntiHeroEntity findOrThrow(final UUID id) {
        return repo
                .findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Anti-hero by id " + id + " was not found")
                );
    }
}
