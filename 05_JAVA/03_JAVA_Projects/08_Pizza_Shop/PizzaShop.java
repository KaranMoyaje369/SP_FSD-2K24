package com.pizza_shop;

public class PizzaShop {

	private String PizzaCatName;
	private int pizzaPrice;
	private int itemQty;
	private double delvCharges;
	private double totalAmt;

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getPizzaName() {
		return PizzaCatName;
	}

	public void setPizzaName(String pizzaName) {
		PizzaCatName = pizzaName;
	}

	public int getPrice() {
		return pizzaPrice;
	}

	public void setPrice(int price) {
		this.pizzaPrice = price;
	}

	public int getQty() {
		return itemQty;
	}

	public void setQty(int qty) {
		this.itemQty = qty;
	}

	public double getDelvCharge() {
		return delvCharges;
	}

	public void setDelvCharge(double delvCharge) {
		this.delvCharges = delvCharge;
	}

	public PizzaShop() {
		// TODO Auto-generated constructor stub
	}

	public PizzaShop(String pizzaCatName, int pizzaPrice, int itemQty, double delvCharges, double totalAmt) {
		super();
		PizzaCatName = pizzaCatName;
		this.pizzaPrice = pizzaPrice;
		this.itemQty = itemQty;
		this.delvCharges = delvCharges;
		this.totalAmt = totalAmt;
	}

	@Override
	public String toString() {
		return "PizzaShop [PizzaCatName=" + PizzaCatName + ", pizzaPrice=" + pizzaPrice + ", itemQty=" + itemQty
				+ ", delvCharges=" + delvCharges + ", totalAmt=" + totalAmt + "]";
	}

	

}
