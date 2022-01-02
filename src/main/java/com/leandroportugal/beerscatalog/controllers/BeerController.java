package com.leandroportugal.beerscatalog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandroportugal.beerscatalog.entities.Beers;
import com.leandroportugal.beerscatalog.repositories.BeerRepository;

@RestController
@RequestMapping(value = "/beers")
public class BeerController {

	@Autowired
	private BeerRepository repository;
	
	@GetMapping
	public List<Beers> findAll(){
		
		List<Beers> result = repository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{id}")
	public Beers findById(@PathVariable Long id){
		
		Beers result = repository.findById(id).get();
		return result;
	}
	
	
	@PostMapping
	public Beers insert(@RequestBody Beers beer){
		
		Beers result = repository.save(beer);
		return result;
	}
}
