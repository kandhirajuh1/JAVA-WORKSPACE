package com.ck.rewards.test.service;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import java.sql.SQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.ck.rewards.dao.LoginDAO;
import com.ck.rewards.service.LoginService;

@RunWith(MockitoJUnitRunner.class)

/**
 * This class is to test Login Functionality
 * 
 * @author Boot Camp Java 11
 *
 */
public class LoginServiceTest {
	@InjectMocks
	private LoginService loginService;
	@Mock
	private LoginDAO loginDAO;

	/**
	 * This is test case validation with valid user credentials
	 * 
	 * @throws SQLException
	 */

	@Test
	public void testValidateUserWithUserCredential() throws SQLException {
		when(loginDAO.isValidUser(any(String.class), any(String.class))).thenReturn(true);
		assertTrue(loginService.validateUser("hari", "hari"));

	}

	/**
	 * This is test case validation for invalid user credentials
	 * 
	 * @throws SQLException
	 */
	@Test
	public void testInValidateUserWithUserCredential() throws SQLException {
		when(loginDAO.isValidUser(any(String.class), any(String.class))).thenReturn(false);
		assertFalse(loginService.validateUser("hari", "hari"));

	}

}
