package com.restaurant.code.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.code.domain.Restaurant;
import com.restaurant.code.domain.RestaurantService;

@RestController
public class RestaurantWebController {

	@Autowired 
	private RestaurantService restaurantService; 

	/* Trova il ristorante con restaurantId. */ 
	@GetMapping("/restaurants/{restaurantId}")
	public Restaurant getRestaurant(@PathVariable Long restaurantId) {
		Restaurant restaurant = restaurantService.getRestaurant(restaurantId);
		return restaurant;
	}

	/* Trova tutti i ristoranti. */ 
	@GetMapping("/restaurants")
	public Collection<Restaurant> getRestaurants() {
		Collection<Restaurant> restaurants = restaurantService.getAllRestaurants();
		return restaurants;
	}
	
	/* Crea un nuovo ristorante. */ 
	@PostMapping("/restaurants")
	public Restaurant addRestaurant(@RequestParam(defaultValue = "", name = "name") String name, 
			@RequestParam String location) {
		Restaurant restaurant = restaurantService.createRestaurant(name, location);
		return restaurant;
	}	

}
