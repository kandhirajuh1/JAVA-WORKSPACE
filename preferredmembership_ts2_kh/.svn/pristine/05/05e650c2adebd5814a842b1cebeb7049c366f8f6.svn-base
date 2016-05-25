package com.ck.rewards.controller;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.ck.rewards.entity.Address;
import com.ck.rewards.entity.RegistrationDto;
import com.ck.rewards.entity.State;
import com.ck.rewards.entity.Store;
import com.ck.rewards.entity.User;
import com.ck.rewards.entity.UserLoginDetails;
import com.ck.rewards.service.RegistrationService;
import com.ck.rewards.service.StoreService;

/**
 * This is a controller class to receive response and provide functionality
 * accordingly
 * 
 * @author Boot Camp Java 11
 *
 */

@Controller
public class RegistrationController {

	@Autowired(required = true)
	private StoreService storeService;

	@Autowired(required = true)
	private RegistrationService registrationService;

	/**
	 * This method directs towards registration page
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public ModelAndView displayRegistration(State s) {

		ModelAndView model = new ModelAndView("Registration");
		ArrayList<Store> storeList = new ArrayList<Store>();
		HashMap<String, String> map = new HashMap<String, String>();

		try {
			storeList = storeService.getStoreListByStateId("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*for (Store str : storeList) {
			String value = str.getStore_Name() + "," + str.getAddrline2() + "," + str.getAddrline2() + str.getCity()
					+ "," + str.getSt_Zip();
			System.out.println(str);*/
			model.addObject("storeList",storeList );
			return model;
		/*}*/
		
		//return "Registration";
	}

	/**
	 * This method has post which is used to collect form details
	 * 
	 * @param regdto
	 * @return
	 */
	@RequestMapping(value = "/Registration", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("RegistrationDto") RegistrationDto regdto) {

		User user = (User) regdto.getUser();
		UserLoginDetails uldt = (UserLoginDetails) regdto.getUserloginDetails();
		Address addrs = (Address) regdto.getAddress();

		try {
			// To verify user already exist
			boolean isUserExist = registrationService.verifyUserExist(user, uldt, addrs);

			if (isUserExist) {
				return "usernamealreadyexist";
			} else {
				// To verify registration process
				boolean registeredUser = registrationService.registerUser(user, uldt, addrs);
				System.out.println("CHECK" + registeredUser);
				if (registeredUser) {

					return "registrationsuccess";
				} else {
					return "registrationfailure";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "registrationfailure";

		}

	}
}
