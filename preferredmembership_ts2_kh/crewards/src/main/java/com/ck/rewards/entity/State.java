package com.ck.rewards.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This class is entity class for Store
 * 
 * @author Boot Camp Java 11
 *
 */
@Entity
@Table(name = "state")
public class State {

	
	 /* @OneToOne(cascade = CascadeType.ALL)	 
	  @JoinColumn(name = "memberId")*/
	 
	@Id
	@GeneratedValue
	private String state_Id;
	private String state_Name;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "state_Id")
	private List<Store> store;

	
	
	/**
	 * @return the store
	 */
	public List<Store> getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(List<Store> store) {
		this.store = store;
	}

	/**
	 * @return the state_Id
	 */
	public String getState_Id() {
		return state_Id;
	}

	/**
	 * @param state_Id
	 *            the state_Id to set
	 */
	public void setState_Id(String state_Id) {
		this.state_Id = state_Id;
	}

	/**
	 * @return the state_Name
	 */
	public String getState_Name() {
		return state_Name;
	}

	/**
	 * @param state_Name
	 *            the state_Name to set
	 */
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}
}
