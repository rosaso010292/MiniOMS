package com.evoluta.oms;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.evoluta.oms.controllers.OrderController;
import com.evoluta.oms.model.entities.Order;
import com.evoluta.oms.model.entities.OrderLine;
import com.evoluta.oms.services.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = OrderController.class)
public class OrderControllerTest {
	@MockBean
	private OrderService orderService;
	@Autowired
	private MockMvc mockMvc;
	private static Order order;
	private static Optional<Order> optional;
	private Long id = new Long(1);
	private String outputJsonOrder = "{\"orderId\":1,\"customerFirstName\":\"Omar\",\"customerLastName\":\"Rosas\",\"customerEmail\":\"nbaand10@gmail.com\",\"orderLines\":[{\"orderLineId\":1,\"productId\":22,\"productDescription\":\"Coffe\",\"unitPrice\":40.5},{\"orderLineId\":2,\"productId\":45,\"productDescription\":\"Tea\",\"unitPrice\":80.5},{\"orderLineId\":3,\"productId\":67,\"productDescription\":\"Soda\",\"unitPrice\":120.5}],\"totalOrderLines\":3,\"totalPrice\":241.5}";

	@BeforeClass
	public static void setUp() {
		OrderLine orderLine = new OrderLine(new Long(1), 22, "Coffe", new BigDecimal(40.5));
		OrderLine orderLine1 = new OrderLine(new Long(2), 45, "Tea", new BigDecimal(80.5));
		OrderLine orderLine2 = new OrderLine(new Long(3), 67, "Soda", new BigDecimal(120.5));
		List<OrderLine> orderLines = Arrays.asList(orderLine, orderLine1, orderLine2);
		order = new Order(new Long(1), "Omar", "Rosas", "nbaand10@gmail.com", orderLines, 3, 241.5);
		optional = Optional.of(order);
	}

	@Test
	public void testCreateOrder() throws Exception {
		Mockito.when(orderService.save(order)).thenReturn(order);

		mockMvc.perform(post("/api/v1/order").contentType("application/json").content(mapToJson(order)))
				.andExpect(status().isCreated()).andExpect(content().string(outputJsonOrder))
				.andExpect(jsonPath("$.customerFirstName", is("Omar"))).andDo(print());
	}

	@Test
	public void testUpdateOrder() throws Exception {
		Mockito.when(orderService.findById(id)).thenReturn(optional);

		Mockito.when(orderService.save(order)).thenReturn(order);

		mockMvc.perform(put("/api/v1/order/{id}", id).contentType("application/json").content(mapToJson(order)))
				.andExpect(status().isCreated()).andExpect(content().string(outputJsonOrder)).andDo(print());
	}

	@Test
	public void testDeleteOrder() throws Exception {
		Mockito.when(orderService.findById(id)).thenReturn(optional);

		Mockito.doNothing().when(orderService).deleteById(id);

		mockMvc.perform(delete("/api/v1/order/{id}", id)).andExpect(status().isOk())
				.andExpect(content().string("Order deleted with success!"));
		Mockito.verify(orderService, times(1)).deleteById(id);
	}

	@Test
	public void testGetOrderById() throws Exception {
		Mockito.when(orderService.findById(id)).thenReturn(optional);

		mockMvc.perform(get("/api/v1/order/{id}", id).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(outputJsonOrder)).andDo(print());
	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

}
