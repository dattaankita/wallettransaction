package com.springdemo.wallettransaction.service.getbalanceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.springdemo.wallettransaction.entity.User;
import com.springdemo.wallettransaction.repository.UserRepository;

@Service
public class GetBalanceServiceImpl implements GetBalanceService{
	
	@Autowired
	private UserRepository userRepository; 

	@Override
	public double getBalance(String userHashId) {
		double x = 0.0;
		try {
			if(!StringUtils.isEmpty(userHashId)) {
				User theUser = userRepository.findByIdAndWalletStatus(userHashId, true);
				final double balance = theUser.getBalance();
				x= balance;
			}
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return x;
	}
}
