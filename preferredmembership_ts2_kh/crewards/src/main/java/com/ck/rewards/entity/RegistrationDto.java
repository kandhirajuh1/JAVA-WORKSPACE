package com.ck.rewards.entity;

/**
 * This class is a DTO class
 * @author Boot Camp Java 11
 *
 */
public class RegistrationDto {

	private User user;
	private UserLoginDetails userloginDetails;
	// private Store store;
	private Address address;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the userloginDetails
	 */
	public UserLoginDetails getUserloginDetails() {
		return userloginDetails;
	}

	/**
	 * @param userloginDetails
	 *            the userloginDetails to set
	 */

	public void setUserloginDetails(UserLoginDetails userloginDetails) {
		this.userloginDetails = userloginDetails;
	}

	/**
	 * @return the store
	 */

	/*
	 * public Store getStore() { return store; }
	 * 
	 *//**
		 * @param store
		 *            the store to set
		 *//*
		 * 
		 * public void setStore(Store store) { this.store = store; }
		 */

	/**
	 * @return the address
	 */

	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */

	public void setAddress(Address address) {
		this.address = address;
	}

}
