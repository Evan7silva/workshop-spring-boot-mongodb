package com.evansilvaworkshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evansilvaworkshopmongo.domain.User;
import com.evansilvaworkshopmongo.dto.UserDTO;
import com.evansilvaworkshopmongo.repository.UserRepository;
import com.evansilvaworkshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
//	public User findById(String id) {
//		User user = repo.find
//		if(user == null) {
//			throw new ObjectNotRoundException("Object not found");
//		}
//		return user;
//		}
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
			
		}
	public User insert(User obj) {
		return repo.insert(obj);
		
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
	public void delte(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
}

