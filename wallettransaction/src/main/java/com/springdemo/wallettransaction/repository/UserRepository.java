package com.springdemo.wallettransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdemo.wallettransaction.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByIdAndWalletStatus(String userHashId, boolean b);

	User findByUserHashId(String userHashId);

	User findByMobileNUmber(String mobileNUmber);
	
}
