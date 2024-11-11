package com.demo.service;

import java.util.List;

import com.demo.dao.PizzashopDao;
import com.demo.dao.PizzashopDaoImpl;
import com.demo.model.Pizzashop;

public class PizzashopServiceImpl implements PizzashopService {

	private PizzashopDao dao;

	public PizzashopServiceImpl() {
		dao = new PizzashopDaoImpl();
	}

	@Override
	public int placeOrder(Pizzashop pizza) {
		return dao.placeOrder(pizza);

	}

	@Override
	public void updateOrder(int itemId, Pizzashop pizza) {
		dao.updateOrder(itemId, pizza);
	}

	@Override
	public Pizzashop viewOrder(int itemId) {
		return dao.viewOrder(itemId);
	}

	@Override
	public void cancelOrder(int itemId) {
		dao.cancelOrder(itemId);

	}

	@Override
	public List<Pizzashop> viewAllOrders() {
		return dao.viewAllOrders();
	}

}
