package com.springdemo.wallettransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.wallettransaction.entity.User;
import com.springdemo.wallettransaction.service.createuserservice.CreateUserRequest;
import com.springdemo.wallettransaction.service.createuserservice.CreateUserService;
import com.springdemo.wallettransaction.service.creditwalletservice.CreditWalletRequest;
import com.springdemo.wallettransaction.service.creditwalletservice.CreditWalletService;
import com.springdemo.wallettransaction.service.debitwalletservice.DebitWalletRequest;
import com.springdemo.wallettransaction.service.debitwalletservice.DebitWalletService;
import com.springdemo.wallettransaction.service.getbalanceservice.GetBalanceService;

@RestController
@RequestMapping("/api/user")
public class UserApiController {
	
	@Autowired
	private DebitWalletService debitWalletService;
	
	@Autowired
	private CreditWalletService creditWalletService;
	
	@Autowired
	private CreateUserService createUserService;
	
	@Autowired
	private GetBalanceService getBalanceService;
	
	@GetMapping(value ="/balance")
	ResponseEntity<?> getBalance(@RequestHeader(value="userHashId") String userHashId) {
		
		return new ResponseEntity<>(getBalanceService.getBalance(userHashId), HttpStatus.OK);
	
	}
		
	@PostMapping(value = "/userdetails")
	ResponseEntity<?> addUser(@RequestBody CreateUserRequest createUserRequest) {
		
		return new ResponseEntity<>(createUserService.addUser(createUserRequest), HttpStatus.OK);
	
	}
	
	@PostMapping(value = "/wallet/debit")
	ResponseEntity<?> debitWallet(@RequestBody DebitWalletRequest debitWalletRequest) {
		
		return new ResponseEntity<>(debitWalletService.debitWallet(debitWalletRequest), HttpStatus.OK);
	
	}
	
	@PostMapping(value = "/wallet/credit")
	ResponseEntity<?> creditWallet(@RequestBody CreditWalletRequest creditWalletRequest) {
		
		return new ResponseEntity<>(creditWalletService.creditWallet(creditWalletRequest), HttpStatus.OK);
	
	}
		
}
