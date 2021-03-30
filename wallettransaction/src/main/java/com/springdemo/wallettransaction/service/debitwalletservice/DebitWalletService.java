package com.springdemo.wallettransaction.service.debitwalletservice;

import com.springdemo.wallettransaction.entity.User;

public interface DebitWalletService {

	User debitWallet(DebitWalletRequest debitWalletRequest);

}
