package com.orderms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderms.entity.Order;


public interface OrderRepository extends JpaRepository<Order, String> {
	
	Order findTopByOrderByOrdersIdDesc();
	List<Order> findAllByBuyerId(String BuyerId);
}
