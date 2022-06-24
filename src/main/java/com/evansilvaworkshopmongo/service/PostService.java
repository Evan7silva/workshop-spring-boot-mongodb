package com.evansilvaworkshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evansilvaworkshopmongo.domain.Post;
import com.evansilvaworkshopmongo.repository.PostRepository;
import com.evansilvaworkshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	
//	public User findById(String id) {
//		User user = repo.find
//		if(user == null) {
//			throw new ObjectNotRoundException("Object not found");
//		}
//		return user;
//		}
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
			
		}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
}