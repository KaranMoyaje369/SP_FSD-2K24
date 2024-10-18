package com.pizzashop.model;

public class PizzaShop {

	private String PizzaCatName;
	private int pizzaPrice;
	private int itemQty;
	private double delvCharges;
	private double totalAmt;
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
