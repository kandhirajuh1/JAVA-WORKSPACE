package com.ck.rewards.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ck.rewards.dao.RegistrationDAO;
//import com.ck.rewards.dao.StoreDAO;
import com.ck.rewards.entity.Address;
//import com.ck.rewards.entity.Store;
import com.ck.rewards.entity.User;
import com.ck.rewards.entity.UserLoginDetails;

/**
 * This class provides registration service functionalities
 * 
 * @author Boot Camp Java 11
 *
 */
@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAO registrationdao;

	/**
	 * This method has functionality to verify whether user exist
	 * 
	 * @param user
	 * @param uldt
	 * @param addr
	 * @return
	 */
	@Transactional
	public boolean verifyUserExist(User user, UserLoginDetails uldt, Address addr) {

		boolean isValidUser = false;
		try {
			isValidUser = registrationdao.validateUserExist(user, uldt, addr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValidUser;

	}

	/**
	 * This method has functionality to register user
	 * 
	 * @param user
	 * @param uldt
	 * @param addr
	 * @return
	 */
	@Transactional
	public boolean registerUser(User user, UserLoginDetails uldt, Address addr) {

		boolean isDataInsert = registrationdao.insertUserData(user, uldt, addr);
		return isDataInsert;

	}

	
	 

}
