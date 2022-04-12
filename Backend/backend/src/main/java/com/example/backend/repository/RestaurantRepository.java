package com.example.backend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.modal.Restaurants;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurants,ObjectId>{

}
