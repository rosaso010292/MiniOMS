package com.evoluta.oms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evoluta.oms.model.entities.Order;
import com.evoluta.oms.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Optional<Order> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public Order save(Order order) {
		return repository.save(order);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
