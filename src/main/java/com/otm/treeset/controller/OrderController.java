package com.otm.treeset.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.ThrowsPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otm.treeset.entities.Order;
import com.otm.treeset.exception.ExistedRecordException;
import com.otm.treeset.repository.OrderRepository;
import com.otm.treeset.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/saveorder")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order, int orderNo) {

		 = orderService.findById(orderNo);

		// orderNo = order2.get().getOrderNo();
		if (order2.isEmpty()) {
			return new ResponseEntity<Order>(orderService.insertOrder(order), HttpStatus.OK);

			// return (ResponseEntity<Order>) ResponseEntity.badRequest();
		} else {
			throw new ExistedRecordException("record is already there with this id: " + orderNo);

		}
	}

	/*
	 * @GetMapping("/getOrders") public ResponseEntity<List<Order>> getorders() {
	 * return new ResponseEntity<List<Order>>(orderService.getOrders(),
	 * HttpStatus.OK); }
	 */

	/*
	 * @GetMapping("/getOrdderByState") public ResponseEntity<List<Order>>
	 * getOrderByState(String state) { return new
	 * ResponseEntity<List<Order>>(orderService.getOrderByState(state),
	 * HttpStatus.OK); }
	 */

	@GetMapping("/getOrdderByStateAndCountry")
	public ResponseEntity<List<Order>> getOrderByState(String state, String country) {
		return new ResponseEntity<List<Order>>(orderService.getOrderByStateAndCountry(state, country), HttpStatus.OK);
	}

	@GetMapping("/getMaxAmount")
	public ResponseEntity<Double> getOrderByMaxAmount() {
		return new ResponseEntity<Double>(orderService.getMaxAmount(), HttpStatus.OK);
	}

	@GetMapping("/getMinAmount")
	public ResponseEntity<Double> getOrdersByMinAmount() {
		return new ResponseEntity<Double>(orderService.getMinAmount(), HttpStatus.OK);
	}

	@GetMapping("/getOrdersByMaxAmount")
	public ResponseEntity<List<Order>> getOrdersByMaxAmount() {
		return new ResponseEntity<List<Order>>(orderService.getOrdersByMaxAmount(), HttpStatus.OK);
	}

	@GetMapping("/getOrdersByMinAmount")
	public ResponseEntity<List<Order>> getOrderByMinAmount() {
		return new ResponseEntity<List<Order>>(orderService.getOrdersByMinAmount(), HttpStatus.OK);
	}

}
