package com.ck.rewards.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * This class is entity class for Country
 * @author Boot Camp Java 11
 *
 */
@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = {
			@Parameter(value = "state", name = "property") })

	private String country_Id;
	private String country_Name;

	/*
	 * @OneToMany(cascade = CascadeType.ALL) private Set<Store> store = new
	 * HashSet<Store>(0);
	 * 
	 *//**
		 * @return the store
		 */
	/*
	 * public Set<Store> getStore() { return store; }
	 * 
	 *//**
		 * @param store
		 *            the store to set
		 *//*
		 * public void setStore(Set<Store> store) { this.store = store; }
		 */

	@OneToMany(cascade = CascadeType.ALL)
	private Set<State> states = new HashSet<State>(0);

	/**
	 * @return the country_Id
	 */
	public String getCountry_Id() {
		return country_Id;
	}

	/**
	 * @param country_Id
	 *            the country_Id to set
	 */
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}

	/**
	 * @return the country_Name
	 */
	public String getCountry_Name() {
		return country_Name;
	}

	/**
	 * @param country_Name
	 *            the country_Name to set
	 */
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
}
