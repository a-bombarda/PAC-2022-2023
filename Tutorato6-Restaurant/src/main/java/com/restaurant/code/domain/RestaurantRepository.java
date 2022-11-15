package com.restaurant.code.domain;

import java.util.ArrayList;
import java.util.Collection;

public class RestaurantRepository {

	ArrayList<Restaurant> listaRistoranti = new ArrayList<Restaurant>();

	public Restaurant save(Restaurant restaurant) {
		this.listaRistoranti.add(restaurant);
		return restaurant;
	}

	public Collection<Restaurant> findAll() {
		return listaRistoranti;
	}

	public Restaurant findByName(String name) {
		for (Restaurant r : listaRistoranti) {
			if (r.getName().equals(name))
				return r;
		}

		return null;
	}

	public Restaurant findById(Long id) {
		for (Restaurant r : listaRistoranti) {
			if (r.getId() == id)
				return r;
		}

		return null;
	}

	public Collection<Restaurant> findAllByLocation(String location) {
		return this.listaRistoranti.stream().filter(x -> x.getLocation().equals(location)).toList();
	}

}
