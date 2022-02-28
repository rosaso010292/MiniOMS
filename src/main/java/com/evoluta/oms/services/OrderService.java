package com.evoluta.oms.services;

import java.util.Optional;

import com.evoluta.oms.model.entities.Order;

public interface OrderService {
	Optional<Order> findById(Long id);

	Order save(Order order);

	void deleteById(Long id);
}
