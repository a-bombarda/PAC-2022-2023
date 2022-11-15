package com.restaurant.code.domain;

import java.util.Collection;

import org.springframework.stereotype.Service; 

@Service
public class RestaurantService {

	private RestaurantRepository restaurantRepository = new RestaurantRepository();

 	public Restaurant createRestaurant(String name, String location) {
		Restaurant restaurant = new Restaurant(name, location); 
		restaurant = restaurantRepository.save(restaurant);
		return restaurant;
	}

 	public Restaurant getRestaurant(Long id) {
		Restaurant restaurant = restaurantRepository.findById(id);
		return restaurant;
	}

 	public Restaurant getRestaurantByName(String name) {
		Restaurant restaurant = restaurantRepository.findByName(name);
		return restaurant;
	}
	
	public Collection<Restaurant> getAllRestaurants() {
		Collection<Restaurant> restaurants = restaurantRepository.findAll(); 
		return restaurants;
	}
	
	public Collection<Restaurant> getAllRestaurantsByLocation(String location) {
		Collection<Restaurant> restaurants = restaurantRepository.findAllByLocation(location);
		return restaurants;
	}
	

}

