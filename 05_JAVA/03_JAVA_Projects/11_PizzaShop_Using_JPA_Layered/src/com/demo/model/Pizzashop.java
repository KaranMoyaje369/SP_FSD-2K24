package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizzashopLayered")
public class Pizzashop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	private String PizzaCatName;
	private int pizzaPrice;
	private int itemQty;
	private double delvCharges;
	private double totalAmt;

	public Pizzashop(int orderID, String pizzaCatName, int pizzaPrice, int itemQty, double delvCharges,
			double totalAmt) {
		super();
		this.orderID = orderID;
		PizzaCatName = pizzaCatName;
		this.pizzaPrice = pizzaPrice;
		this.itemQty = itemQty;
		this.delvCharges = delvCharges;
		this.totalAmt = totalAmt;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getPizzaCatName() {
		return PizzaCatName;
	}

	public void setPizzaCatName(String pizzaCatName) {
		PizzaCatName = pizzaCatName;
	}

	public int getPizzaPrice() {
		return pizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public double getDelvCharges() {
		return delvCharges;
	}

	public void setDelvCharges(double delvCharges) {
		this.delvCharges = delvCharges;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Pizzashop() {
		// TODO Auto-generated constructor stub
	}

	public Pizzashop(String pizzaCatName, int pizzaPrice, int itemQty, double delvCharges, double totalAmt) {
		super();
		PizzaCatName = pizzaCatName;
		this.pizzaPrice = pizzaPrice;
		this.itemQty = itemQty;
		this.delvCharges = delvCharges;
		this.totalAmt = totalAmt;
	}

	@Override
	public String toString() {
		return "Pizzashop [orderID=" + orderID + ", PizzaCatName=" + PizzaCatName + ", pizzaPrice=" + pizzaPrice
				+ ", itemQty=" + itemQty + ", delvCharges=" + delvCharges + ", totalAmt=" + totalAmt + "]";
	}

}
