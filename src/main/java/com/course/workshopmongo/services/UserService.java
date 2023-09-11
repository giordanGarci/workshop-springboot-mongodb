package com.course.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.workshopmongo.domain.User;
import com.course.workshopmongo.dto.UserDTO;
import com.course.workshopmongo.repository.UserRepository;
import com.course.workshopmongo.services.exeptions.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	public User insert(User obj) {
		return userRepository.insert(obj);
	}

	public void delete(String id) {
		try {
			if (!userRepository.existsById(id))
				throw new ObjectNotFoundException(id);
			userRepository.deleteById(id);
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(id);
		}
	}

	public User update(User obj) {
		try{
			User newObj = userRepository.findById(obj.getId())
					.orElseThrow(() -> new ObjectNotFoundException("Usuário com Id: " + obj.getId() + " não encontrado."));
			updateData(newObj, obj);
			return userRepository.save(newObj);
		}catch(ObjectNotFoundException e) {
			throw new ObjectNotFoundException(obj.getId());
			}
		}

	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());
	}

}
