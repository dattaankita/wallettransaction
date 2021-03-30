package com.springdemo.wallettransaction.service.createuserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.wallettransaction.entity.User;
import com.springdemo.wallettransaction.repository.UserRepository;

@Service
public class CreateUserServiceImpl implements CreateUserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(CreateUserRequest createUserRequest) {
		try {
			User user = new User();
			user.setBalance(0.0);
			user.setWalletStatus(true);
			user.setEmail(createUserRequest.getEmail());
			user.setFirstName(createUserRequest.getFirstName());
			user.setLastName(createUserRequest.getLastName());
			user.setMobileNumber(createUserRequest.getMobileNumber());
			user.setUserHashId(System.currentTimeMillis()+"");
			
			userRepository.save(user);
			
			return user;
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
}
