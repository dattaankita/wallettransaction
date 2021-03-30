package com.springdemo.wallettransaction.service.creditwalletservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.wallettransaction.entity.User;
import com.springdemo.wallettransaction.repository.UserRepository;

@Service
public class CreditWalletServiceImpl implements CreditWalletService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User creditWallet(CreditWalletRequest creditWalletRequest) {
		try {
			User user = userRepository.findByMobileNUmber(creditWalletRequest.getMobileNUmber());
			if(creditWalletRequest.getBalance() < 1) 
				throw new Exception("Enter valid Amount ");
			user.setBalance(user.getBalance() + creditWalletRequest.getBalance());
			userRepository.save(user);
			return user;
			
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
