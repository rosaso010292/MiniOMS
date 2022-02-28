package com.evoluta.oms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.evoluta.oms.model.entities.Order;
import com.evoluta.oms.model.entities.OrderLine;
import com.evoluta.oms.repositories.OrderRepository;
import com.evoluta.oms.services.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderRepositoryTest {

	@Autowired
	private OrderService service;
	
	@MockBean
	private OrderRepository repository;
	private Long id = new Long(1);
	
	@BeforeClass
	public static void setUp() {
		
	}

	@Test
	void testCreateOrder() {
		Order order = getInitData();
		
		when(repository.save(order)).thenReturn(order);
		
		assertEquals(order, service.save(order));
	}
	
	@Test
	void testFindByIdOrder() {
		Order order = getInitData();
		
		when(repository.findById(id)).thenReturn(Optional.of(order));
		
		Optional<Order> optional = service.findById(id);
		
		assertTrue(optional.isPresent());
		assertEquals(order, optional.get());	
	}
	
	@Test
	void testDeleteOrder() {
		service.deleteById(id);
		verify(repository, times(1)).deleteById(id);	
	}
	
	private Order getInitData() {
		OrderLine orderLine = new OrderLine(new Long(1), 22, "Coffe", new BigDecimal(40.5));
		OrderLine orderLine1 = new OrderLine(new Long(2), 45, "Tea", new BigDecimal(80.5));
		OrderLine orderLine2 = new OrderLine(new Long(3), 67, "Soda", new BigDecimal(120.5));
		List<OrderLine> orderLines = Arrays.asList(orderLine, orderLine1, orderLine2);
		return new Order(new Long(1), "Omar", "Rosas", "nbaand10@gmail.com", orderLines, 3, 241.5);
	}

}
