package com.ck.rewards.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ck.rewards.dao.LoginDAO;
import com.ck.rewards.service.LoginService;

/**
 * This class provides the implementation for loginservice interface
 * 
 * @author Boot Camp Java 11
 *
 */

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDao;

	/**
	 * This method pass username and password to service layer
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */

	@Transactional
	public boolean validateUser(String username, String password) throws SQLException {
		return loginDao.isValidUser(username, password);

	}

}
