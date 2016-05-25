
package com.ck.rewards.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.transaction.annotation.Transactional;

/**
 * This class provides details of store
 * 
 * @author Boot Camp Java 11
 *
 */

@Entity
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue
	private int store_Id;

	@NotNull
	private String store_Name;

	@NotNull
	private String addrline1;

	@NotNull
	private String addrline2;

	@NotNull
	@Column(name = "stZipCode")
	private String st_Zip;

	@NotNull
	private String city;

	/**
	 * @return the store_Id
	 */

	public int getStore_Id() {
		return store_Id;
	}

	/**
	 * @param store_Id
	 *            the store_Id to set
	 */

	public void setStore_Id(int store_Id) {
		this.store_Id = store_Id;
	}

	/**
	 * @return the store_Name
	 */

	public String getStore_Name() {
		return store_Name;
	}

	/**
	 * @param store_Name
	 *            the store_Name to set
	 */

	public void setStore_Name(String store_Name) {
		this.store_Name = store_Name;
	}

	/**
	 * @return the addrline1
	 */

	public String getAddrline1() {
		return addrline1;
	}

	/**
	 * @param addrline1
	 *            the addrline1 to set
	 */

	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}

	/**
	 * @return the addrline2
	 */

	public String getAddrline2() {
		return addrline2;
	}

	/**
	 * @param addrline2
	 *            the addrline2 to set
	 */

	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}

	/**
	 * @return the st_Zip
	 */

	public String getSt_Zip() {
		return st_Zip;
	}

	/**
	 * @param st_Zip
	 *            the st_Zip to set
	 */

	public void setSt_Zip(String st_Zip) {
		this.st_Zip = st_Zip;
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

}
