package com.pizzashop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizzashop")
public class Pizzashop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Enables auto-increment
	private int itemID;
	private String PizzaCatName;
	private int PizzaPrice;
	private int PizzaitemQty;
	private double PizzadelvCharges;
	private double PizzatotalAmt;

//	getters and setters
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getPizzaCatName() {
		return PizzaCatName;
	}

	public void setPizzaCatName(String pizzaCatName) {
		PizzaCatName = pizzaCatName;
	}

	public int getPizzaPrice() {
		return PizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.PizzaPrice = pizzaPrice;
	}

	public int getItemQty() {
		return PizzaitemQty;
	}

	public void setItemQty(int itemQty) {
		this.PizzaitemQty = itemQty;
	}

	public double getDelvCharges() {
		return PizzadelvCharges;
	}

	public void setDelvCharges(double delvCharges) {
		this.PizzadelvCharges = delvCharges;
	}

	public double getTotalAmt() {
		return PizzatotalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.PizzatotalAmt = totalAmt;
	}

//	default constructor
	public Pizzashop() {
		// TODO Auto-generated constructor stub
	}

//	param constructor
	public Pizzashop(int itemID, String pizzaCatName, int pizzaPrice, int itemQty, double delvCharges,
			double totalAmt) {
		super();
		this.itemID = itemID;
		PizzaCatName = pizzaCatName;
		this.PizzaPrice = pizzaPrice;
		this.PizzaitemQty = itemQty;
		this.PizzadelvCharges = delvCharges;
		this.PizzatotalAmt = totalAmt;
	}

//	ToString method
	@Override
	public String toString() {
		return "Pizzashop [itemID=" + itemID + ", PizzaCatName=" + PizzaCatName + ", pizzaPrice=" + PizzaPrice
				+ ", itemQty=" + PizzaitemQty + ", delvCharges=" + PizzadelvCharges + ", totalAmt=" + PizzatotalAmt
				+ "]";
	}

}
