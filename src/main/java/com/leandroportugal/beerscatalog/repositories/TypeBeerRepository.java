package com.leandroportugal.beerscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroportugal.beerscatalog.entities.TypeBeer;

public interface TypeBeerRepository extends JpaRepository<TypeBeer, Long>  {

}
