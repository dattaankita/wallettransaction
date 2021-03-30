package com.springdemo.wallettransaction.service.debitwalletservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.wallettransaction.entity.User;
import com.springdemo.wallettransaction.repository.UserRepository;

@Service
public class DebitWalletServiceImpl implements DebitWalletService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User debitWallet(DebitWalletRequest debitWalletRequest) {
		try {
			User user = userRepository.findByMobileNUmber(debitWalletRequest.getMobileNUmber());
			if(debitWalletRequest.getBalance() < 1) 
				throw new Exception("Enter valid Amount ");
			if(debitWalletRequest.getBalance() < user.getBalance()) {
				user.setBalance(user.getBalance() - debitWalletRequest.getBalance());
				userRepository.save(user);
			}
			return user;
			
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
