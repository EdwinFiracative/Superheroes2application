package com.example.superheroesapplication2.antiHero.repository;

import com.example.superheroesapplication2.antiHero.entity.AntiHeroEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AntiHeroRepository extends CrudRepository<AntiHeroEntity, UUID> {
}