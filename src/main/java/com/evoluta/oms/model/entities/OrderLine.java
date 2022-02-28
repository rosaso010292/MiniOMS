package com.evoluta.oms.model.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@Table(name = "order_line")
@Entity
public class OrderLine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_line_id")
	private Long orderLineId;
	@Column(name = "product_id", nullable = false)
	private Integer productId;
	@Column(name = "product_description", length = 255, nullable = false)
	private String productDescription;
	@Column(name = "unit_price", nullable = false, precision=10, scale=2)
	private BigDecimal unitPrice;
}
