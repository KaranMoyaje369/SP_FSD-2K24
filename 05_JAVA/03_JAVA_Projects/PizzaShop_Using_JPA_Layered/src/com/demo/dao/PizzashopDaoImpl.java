package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.demo.model.Pizzashop;

public class PizzashopDaoImpl implements PizzashopDao {

	private static EntityManagerFactory factory;
	private static EntityManager entity;

	static {
		factory = Persistence.createEntityManagerFactory("pizzashoplayered");
	}

	public static EntityManager getEntityManager() {

		if (entity == null || !entity.isOpen()) {
			entity = factory.createEntityManager();
		}

		return entity;

	}

	@Override
	public int placeOrder(Pizzashop pizza) {
		EntityManager entity = JPAUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(pizza);
		entity.getTransaction().commit();
		return pizza.getOrderID();
	}

	@Override
	public void updateOrder(int itemId, Pizzashop pizza) {
		EntityManager entity = JPAUtil.getEntityManager();
		Pizzashop existingPizza = entity.find(Pizzashop.class, itemId);

		if (existingPizza != null) {
			entity.getTransaction().begin();
			existingPizza.setPizzaCatName(pizza.getPizzaCatName());
			existingPizza.setPizzaPrice(pizza.getPizzaPrice());
			existingPizza.setItemQty(pizza.getItemQty());
			existingPizza.setDelvCharges(pizza.getDelvCharges());
			existingPizza.setTotalAmt(pizza.getTotalAmt());
			entity.getTransaction().commit();
		}

	}

	@Override
	public Pizzashop viewOrder(int itemId) {
		EntityManager entity = JPAUtil.getEntityManager();
		Pizzashop pizza = entity.find(Pizzashop.class, itemId);
		return pizza;
	}

	@Override
	public void cancelOrder(int itemId) {
		EntityManager entity = JPAUtil.getEntityManager();
		Pizzashop pizza = entity.find(Pizzashop.class, itemId);
		if (pizza != null) {
			entity.getTransaction().begin();
			entity.remove(pizza);
			entity.getTransaction().commit();
		}

	}

	@Override
	public List<Pizzashop> viewAllOrders() {
		EntityManager entity = JPAUtil.getEntityManager();
		TypedQuery<Pizzashop> query = entity.createQuery("SELECT P FROM Pizzashop P", Pizzashop.class);
		List<Pizzashop> pizzas = query.getResultList();
		return pizzas;
	}

}
