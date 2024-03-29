package com.evansilvaworkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.evansilvaworkshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
