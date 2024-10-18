package com.pizzashop.service;

import java.util.Map.Entry;
import java.util.Set;

import com.pizzashop.model.PizzaShop;

public interface PizzaServices {

	int placeOrder(PizzaShop ps);

	PizzaShop updateOrder(int orderId, PizzaShop ps);

	PizzaShop viewOrder(int orderId);

	void cancelOrder(int orderId);

	Set<Entry<Integer, PizzaShop>> viewAllOrder();

}
