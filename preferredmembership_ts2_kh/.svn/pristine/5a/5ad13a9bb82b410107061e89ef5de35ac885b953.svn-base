
package com.ck.rewards.dao;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.RegistrationDto;
import com.ck.rewards.entity.User;
import com.ck.rewards.entity.UserLoginDetails;

/**
 * This class is to perform registration Dao process
 * 
 * @author Boot Camp Java 11
 *
 */
@Repository
public class RegistrationDAO {

	/**
	 * This method is to retreive store data from data base
	 * 
	 * @param storeId
	 * @return
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * This method is to validate weather the User is exist
	 * 
	 * @param user
	 * @param uldt
	 * @param addrs
	 * @return
	 * @throws SQLException
	 */

	public boolean validateUserExist(User user, UserLoginDetails uldt, Address addrs) throws SQLException {

		String sql = "from UserLoginDetails where username=?";
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		UserLoginDetails users = (UserLoginDetails) query.setString(0, uldt.getUsername()).uniqueResult();

		if (users != null) {
			return true;
		} else {
			return false;

		}
	}

	/**
	 * This method is to insert and verify user data
	 * 
	 * @param user
	 * @param uldt
	 * @param addrs
	 * @return
	 */
	public boolean insertUserData(User user, UserLoginDetails uldt, Address addrs) {

		try {

			uldt.setUser(user);
			sessionFactory.getCurrentSession().save(user);
			sessionFactory.getCurrentSession().save(uldt);
			sessionFactory.getCurrentSession().save(addrs);
			System.out.println("hari");
			return true;

		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

}
