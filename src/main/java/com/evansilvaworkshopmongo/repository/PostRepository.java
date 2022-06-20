package com.evansilvaworkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.evansilvaworkshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
