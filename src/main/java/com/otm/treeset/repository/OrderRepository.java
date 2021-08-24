package com.otm.treeset.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.otm.treeset.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {


	/*
	 * @Query(value = "select * from orders") public List<Order> getOrderDetails();
	 */
	/* sql */
	// @Query(value = "select * from orders o where o.state=?1", nativeQuery =true)
	/* jpql */
	// @Query(value = "select o from orders o where o.state=?1")
	// @Query(value = "from orders o where o.state=?1")
	// @Query(value = "from orders o where o.state='AP'")
	@Query(value = "from orders o where o.state='AP'")
	public List<Order> getOrderByState(String state);

	@Query(value = "from orders o where o.state=?1 and o.country=?2")
	public List<Order> getOrderByStateAndCountry(String state, String country);

	@Query(value = "select max(amount) from orders", nativeQuery = true)
	public double getMaxAmount();

	@Query(value = "select min(amount) from orders", nativeQuery = true)
	public double getMinAmount();

	@Query(value = "select * from orders where amount=(select max(amount) from orders)", nativeQuery = true)
	public List<Order> getOrdersByMaxAmount();

	@Query(value = "select * from orders where amount=(select min(amount) from orders)", nativeQuery = true)
	public List<Order> getOrdersByMinAmount();
}