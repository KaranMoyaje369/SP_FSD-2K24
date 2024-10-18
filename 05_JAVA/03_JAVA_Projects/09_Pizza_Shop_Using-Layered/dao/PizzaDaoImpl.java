package com.pizzashop.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.pizzashop.model.PizzaShop;

public class PizzaDaoImpl implements PizzaDao {

	// Database using collection

	HashMap<Integer, PizzaShop> pizzashop = new HashMap<Integer, PizzaShop>();

	int orderId = 1000; // auto incremented

	@Override
	public int placeOrder(PizzaShop ps) {
		pizzashop.put(++orderId, ps);
		return orderId;
	}

	@Override
	public PizzaShop updateOrder(int orderId, PizzaShop ps) {
		PizzaShop ps1 = pizzashop.put(orderId, ps);
		return ps1;
	}

	@Override
	public PizzaShop viewOrder(int orderId) {

		PizzaShop ps2 = pizzashop.get(orderId);
		return ps2;
	}

	@Override
	public void cancelOrder(int orderId) {
		pizzashop.remove(orderId);

	}

	@Override
	public Set<Entry<Integer, PizzaShop>> viewAllOrder() {
		Set<Entry<Integer, PizzaShop>> result = pizzashop.entrySet();
		return result;
	}

}
