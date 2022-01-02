package com.leandroportugal.beerscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroportugal.beerscatalog.entities.Beers;

public interface BeerRepository extends JpaRepository<Beers, Long> {

	
}
