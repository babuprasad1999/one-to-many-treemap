package com.otm.treeset.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.otm.treeset.entities.Order;

@Service
public interface OrderService {

	public Order insertOrder(Order order);

	public Optional<Order> findById(int orderNo);

	/* public List<Order> getOrders(); */

	public List<Order> getOrderByState(String state);

	public List<Order> getOrderByStateAndCountry(String state, String country);

	public double getMaxAmount();

	public double getMinAmount();

	public List<Order> getOrdersByMaxAmount();

	public List<Order> getOrdersByMinAmount();

}
