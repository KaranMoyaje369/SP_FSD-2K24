package com.pizzashop.service;

import java.util.Map.Entry;
import java.util.Set;

import com.pizzashop.dao.PizzaDao;
import com.pizzashop.dao.PizzaDaoImpl;
import com.pizzashop.model.PizzaShop;

public class PizzaServiceImpl implements PizzaServices {

	// object cresting of dao layer
	PizzaDao dao = new PizzaDaoImpl();

	@Override
	public int placeOrder(PizzaShop ps) {

		return dao.placeOrder(ps);
	}

	@Override
	public PizzaShop updateOrder(int orderId, PizzaShop ps) {

		return dao.updateOrder(orderId, ps);
	}

	@Override
	public PizzaShop viewOrder(int orderId) {

		return dao.viewOrder(orderId);
	}

	@Override
	public void cancelOrder(int orderId) {
		dao.cancelOrder(orderId);

	}

	@Override
	public Set<Entry<Integer, PizzaShop>> viewAllOrder() {

		return dao.viewAllOrder();
	}

}
