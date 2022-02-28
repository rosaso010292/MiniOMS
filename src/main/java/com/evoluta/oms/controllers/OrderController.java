package com.evoluta.oms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoluta.oms.exceptions.ResourceNotFoundException;
import com.evoluta.oms.model.entities.Order;
import com.evoluta.oms.services.OrderService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
@Validated
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/order")
	public ResponseEntity<?> createOrder(@RequestBody Order order) {
		Order orderdb = orderService.save(order);
		return ResponseEntity.status(HttpStatus.CREATED).body(orderdb);
	}

	@PutMapping(value = "/order/{id}")
	public ResponseEntity<?> updateOrder(@PathVariable Long id, @RequestBody Order order) {
		return orderService.findById(id).map(orderdb -> {
			orderdb.setCustomerFirstName(order.getCustomerFirstName());
			orderdb.setCustomerLastName(order.getCustomerLastName());
			orderdb.setCustomerEmail(order.getCustomerEmail());
			orderdb.setOrderLines(order.getOrderLines());
			orderdb = orderService.save(orderdb);
			return ResponseEntity.status(HttpStatus.CREATED).body(orderdb);
		}).orElseThrow(() -> new ResourceNotFoundException("Order with ID :" + id + " Not Found!"));
	}

	@DeleteMapping(value = "/order/{id}")
	public ResponseEntity<?> deleteOrder(@PathVariable Long id) {
		return orderService.findById(id).map(order -> {
			orderService.deleteById(order.getOrderId());
			return ResponseEntity.ok().body("Order deleted with success!");
		}).orElseThrow(() -> new ResourceNotFoundException("Order with ID :" + id + " Not Found!"));

	}

	@GetMapping("/order/{id}")
	public ResponseEntity<?> getOrderById(@PathVariable Long id) {
		return orderService.findById(id).map(order -> {
			int totalOrderLines = order.getOrderLines().size();
			order.setTotalOrderLines(totalOrderLines);
			Double totalPrice = order.getOrderLines().stream().mapToDouble(ol -> ol.getUnitPrice().doubleValue()).sum();
			order.setTotalPrice(totalPrice);
			return ResponseEntity.ok().body(order);
		}).orElseThrow(() -> new ResourceNotFoundException("Order with ID :" + id + " Not Found!"));

	}
}
