package com.evoluta.oms.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Table(name = "`order`")
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;
	@Column(name = "customer_first_name", length = 255, nullable = false)
	private String customerFirstName;
	@Column(name = "customer_last_name", length = 255, nullable = false)
	private String customerLastName;
	@Column(name = "customer_email", length = 255, nullable = false)
	private String customerEmail;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", nullable = false, referencedColumnName = "order_id")
	@Column(name = "order_line")
	private List<OrderLine> orderLines = new ArrayList<>();
	@Transient
	private Integer totalOrderLines;
	@Transient
	private Double totalPrice;

}
