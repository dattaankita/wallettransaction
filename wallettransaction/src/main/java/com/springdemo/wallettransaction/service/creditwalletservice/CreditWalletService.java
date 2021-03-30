package com.springdemo.wallettransaction.service.creditwalletservice;

import com.springdemo.wallettransaction.entity.User;

public interface CreditWalletService {

	User creditWallet(CreditWalletRequest creditWalletRequest);
	
}
