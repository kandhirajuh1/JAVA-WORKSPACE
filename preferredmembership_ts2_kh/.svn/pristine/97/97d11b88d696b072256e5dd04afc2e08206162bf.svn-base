package com.ck.rewards.dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ck.rewards.dao.LoginDAO;

/**
 * This class provides implementation for method in LoginDAO interface
 * 
 * @author Boot Camp Java 11
 *
 */
@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * This method is to validate user
	 */

	public boolean isValidUser(String username, String password) throws SQLException {

		String SQL_QUERY = " from UserLoginDetails as o where o.username=? and o.password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(SQL_QUERY);
		query.setParameter(0, username);
		query.setParameter(1, password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			return true;
		} else {
			return false;
		}

	}

}
