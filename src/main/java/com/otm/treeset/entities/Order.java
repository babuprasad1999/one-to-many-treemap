package com.otm.treeset.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "orders")
@Table(name = "orders")

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "order_no")
	protected int orderNo;
	protected String Date;
	protected double amount;
	@Column(name = "delivary_date")
	protected String delivaryDate;
	protected String address;
	protected String city;
	protected String state;
	protected String country;
	protected String zipcode;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Product.class)
	protected Set<Product> product = new TreeSet<Product>();

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDelivaryDate() {
		return delivaryDate;
	}

	public void setDelivaryDate(String delivaryDate) {
		this.delivaryDate = delivaryDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", Date=" + Date + ", amount=" + amount + ", delivaryDate=" + delivaryDate
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode="
				+ zipcode + ", product=" + product + "]";
	}

}
