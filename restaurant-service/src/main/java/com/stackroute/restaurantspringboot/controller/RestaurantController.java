package com.stackroute.restaurantspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String displayRestaurant() {

		return "Hi resturant service is under development";
	}

}
