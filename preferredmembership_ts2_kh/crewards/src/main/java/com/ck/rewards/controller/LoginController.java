package com.ck.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ck.rewards.entity.UserLoginDetails;
import com.ck.rewards.service.LoginService;

/**
 * This class controls the flow of the functionality *
 * 
 * @author Boot Camp Java 11
 *
 */

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * This method directs to get started page*
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getstarted", method = RequestMethod.GET)
	public String displayGetStarted(Model model) {
		return "getstarted";
	}

	/**
	 * This method directs to home page*
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String displayHome(Model model) {
		return "home";
	}

	/**
	 * This method directs to login page*
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String displayLogin(Model model) {
		return "login";
	}

	/**
	 * This method is to execute the functionality of login *
	 * 
	 * @param UserLoginDetails
	 * @return
	 */

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String executeLogin(@ModelAttribute("UserLoginDetails") UserLoginDetails UserLoginDetails) {

		try {
			// To validate registration process
			boolean isValidUser = loginService.validateUser(UserLoginDetails.getUsername(),
					UserLoginDetails.getPassword());

			if (isValidUser) {
				return "loginsuccess";
			} else {
				return "loginfailure";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "loginfailure";

		}

	}

}
