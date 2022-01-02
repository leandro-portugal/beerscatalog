package com.leandroportugal.beerscatalog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leandroportugal.beerscatalog.entities.TypeBeer;
import com.leandroportugal.beerscatalog.repositories.TypeBeerRepository;

@RestController
@RequestMapping(value = "/typebeers")
public class TypeBeerController {

	@Autowired
	private TypeBeerRepository repository;
	
	@GetMapping
	public List<TypeBeer> findAll(){
		
		List<TypeBeer> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public TypeBeer findById(@PathVariable Long id){
		
		TypeBeer result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public TypeBeer insert(@RequestBody TypeBeer typebeer){
			
		TypeBeer result = repository.save(typebeer);
		return result;
	}

	
}
