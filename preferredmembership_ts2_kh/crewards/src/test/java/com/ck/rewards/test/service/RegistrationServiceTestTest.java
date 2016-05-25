package com.ck.rewards.test.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import java.sql.SQLException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.ck.rewards.dao.RegistrationDAO;
import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.User;
import com.ck.rewards.entity.UserLoginDetails;
import com.ck.rewards.service.RegistrationService;

@RunWith(MockitoJUnitRunner.class)
/**
 * This class is test case for registration service
 * 
 * @author Boot Camp Java 11
 *
 */
public class RegistrationServiceTestTest {
	@InjectMocks
	private RegistrationService registrationService;
	@Mock
	private RegistrationDAO registrationDAO;

	/**
	 * This class is to test with existing user case
	 * 
	 * @throws SQLException
	 */

	@Test
	public void testVerifyUserExistWithExistingUser() throws SQLException {
		when(registrationDAO.validateUserExist(any(User.class), any(UserLoginDetails.class), any(Address.class)))
				.thenReturn(true);
		assertTrue(registrationService.verifyUserExist(new User(), new UserLoginDetails(), new Address()));

	}

	/**
	 * This class is to test when user is not existing
	 * 
	 * @throws SQLException
	 *//*
	@Test
	public void testVerifyUserExistWithNonExistingUser() throws SQLException {
		when(registrationDAO.validateUserExist(any(User.class), any(UserLoginDetails.class), any(Address.class)))
				.thenReturn(false);
		assertTrue(registrationService.verifyUserExist(new User(), new UserLoginDetails(), new Address()));

	}*/

}
