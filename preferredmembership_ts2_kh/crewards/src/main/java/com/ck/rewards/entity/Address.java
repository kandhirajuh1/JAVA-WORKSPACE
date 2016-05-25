package com.ck.rewards.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;

/**
 * This class is an entity class to provide address details
 * 
 * @author Boot Camp Java 11
 *
 */

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue

	private String address_Id;
	@NotNull
	private String addressLine1;

	@NotNull
	private String addressLine2;

	@NotNull
	private String city;

	@NotNull
	private String zipcode;

	@NotNull
	private int state_Id;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<User> users = new HashSet<User>(0);

	/**
	 * @return the state_Id
	 */
	public int getState_Id() {
		return state_Id;
	}

	/**
	 * @param state_Id
	 *            the state_Id to set
	 */
	public void setState_Id(int state_Id) {
		this.state_Id = state_Id;
	}

	/**
	 * @return the country_Id
	 */
	public int getCountry_Id() {
		return country_Id;
	}

	/**
	 * @param country_Id
	 *            the country_Id to set
	 */
	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}

	@Column
	private int country_Id;

	/**
	 * @return the addressLine1
	 */

	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1
	 *            the addressLine1 to set
	 */

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */

	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2
	 *            the addressLine2 to set
	 */

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */

	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */

	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
