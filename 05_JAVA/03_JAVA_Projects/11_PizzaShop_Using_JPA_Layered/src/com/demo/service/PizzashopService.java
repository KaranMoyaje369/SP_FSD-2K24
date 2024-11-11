package com.demo.service;

import java.util.List;

import com.demo.model.Pizzashop;

public interface PizzashopService {

	int placeOrder(Pizzashop pizza);

	void updateOrder(int itemId, Pizzashop pizza);

	Pizzashop viewOrder(int itemId);

	void cancelOrder(int itemId);

	List<Pizzashop> viewAllOrders();
}
