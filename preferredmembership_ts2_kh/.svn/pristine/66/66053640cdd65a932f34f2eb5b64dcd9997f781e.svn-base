package com.ck.rewards.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ck.rewards.entity.State;
import com.ck.rewards.entity.Store;

/**
 * This class is to retreive data from database *
 * 
 * @author Boot Camp Java 11
 *
 */
@Repository
public class StoreDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ArrayList<Store> getStoresList(String state_Id) {

		try {
			/*Store store = new Store();
			State state = new State();
			state.setStore(store);
			*/
			
			String SQL_QUERY = "from Store where state_Id = :stateId";
			Query query = sessionFactory.getCurrentSession().createQuery(SQL_QUERY);
			
			System.out.println(query);
			query.setParameter("stateId", state_Id);
			
			@SuppressWarnings("unchecked")
			ArrayList<Store> stores = (ArrayList<Store>) query.list();
			for(Store str : stores){
				System.out.println(str);
			}
						
			return stores;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
