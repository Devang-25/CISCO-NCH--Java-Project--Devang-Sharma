package com.spring.restapi.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.restapi.models.Product;


/*
 * @author Devang
 */




public interface ProductRepository extends MongoRepository<Product, String> {
	public Optional<Product> findById(String id);
}
