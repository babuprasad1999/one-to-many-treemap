package com.otm.treeset.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.otm.treeset.entities.Order;
import com.otm.treeset.repository.OrderRepository;
import com.otm.treeset.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	/*
	 * @Override public List<Order> getOrders() { return
	 * orderRepository.getOrderDetails(); }
	 */

	@Override
	public Order insertOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrderByState(String state) {
		return orderRepository.getOrderByState(state);
	}

	@Override
	public List<Order> getOrderByStateAndCountry(String state, String country) {
		return orderRepository.getOrderByStateAndCountry(state, country);
	}

	@Override
	public double getMaxAmount() {
		return orderRepository.getMaxAmount();
	}

	public double getMinAmount() {
		return orderRepository.getMinAmount();
	}

	public List<Order> getOrdersByMaxAmount() {
		return orderRepository.getOrdersByMaxAmount();
	}

	public List<Order> getOrdersByMinAmount() {
		return orderRepository.getOrdersByMinAmount();
	}

	@Override
	public Optional<Order> findById(int orderNo) {
		return orderRepository.findById(orderNo);
	}
}
