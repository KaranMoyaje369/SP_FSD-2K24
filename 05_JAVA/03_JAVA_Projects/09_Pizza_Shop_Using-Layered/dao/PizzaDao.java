package com.pizzashop.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.pizzashop.model.PizzaShop;

public interface PizzaDao {

	int placeOrder(PizzaShop ps);

	PizzaShop updateOrder(int orderId, PizzaShop ps);

	PizzaShop viewOrder(int orderId);

	void cancelOrder(int orderId);

	Set<Entry<Integer, PizzaShop>> viewAllOrder();
}
