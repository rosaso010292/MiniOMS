package com.evoluta.oms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoluta.oms.model.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
