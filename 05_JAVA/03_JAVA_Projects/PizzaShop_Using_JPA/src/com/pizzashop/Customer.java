package com.pizzashop;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Customer {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pizzashop");
		EntityManager entity = factory.createEntityManager();

		while (true) {
			System.out.println("**** Pizza Shop ****");
			System.out.println("1. Place Order ");
			System.out.println("2. Update Order ");
			System.out.println("3. View Order ");
			System.out.println("4. Cancel Order ");
			System.out.println("5. View All Order \n");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Choice : ");
			int option = sc.nextInt();
			System.out.println();

			switch (option) {

			case 1:
				entity.getTransaction().begin();

				Pizzashop ps = new Pizzashop();

				System.out.println("Order Details : ");
				System.out.print("Enter Pizza Category : ");
				String PizzaCatName = sc.next();
				ps.setPizzaCatName(PizzaCatName);

				System.out.print("Enter price for Pizza : ");
				int pizzaPrice = sc.nextInt();
				ps.setPizzaPrice(pizzaPrice);

				System.out.print("Enter Item Quantity : ");
				int itemQty = sc.nextInt();
				ps.setItemQty(itemQty);
				double delvCharges = (pizzaPrice * 15) / 100;
				System.out.println("Delivery Charges : " + delvCharges);
				ps.setDelvCharges(delvCharges);

				double totalAmt = (pizzaPrice * itemQty) + delvCharges;
				System.out.println("Total Price : " + totalAmt);
				ps.setTotalAmt(totalAmt);

				entity.persist(ps);
				int itemID = ps.getItemID();
				System.out.println("Order Placed SuccessFully...! For Order Id : " + itemID);
				System.out.println();
				entity.getTransaction().commit();

				break;

			case 2:
				System.out.println("Order Update Process : ");
				System.out.println("Enter Item Id :  ");
				int itemId = sc.nextInt();
				Pizzashop ps1 = entity.find(Pizzashop.class, itemId);

				entity.getTransaction().begin();

				System.out.print("Enter Pizza Category : ");
				String PizzaCatName1 = sc.next();
				ps1.setPizzaCatName(PizzaCatName1);

				System.out.print("Enter price for Pizza : ");
				int pizzaPrice1 = sc.nextInt();
				ps1.setPizzaPrice(pizzaPrice1);

				System.out.print("Enter Item Quantity : ");
				int itemQty1 = sc.nextInt();
				ps1.setItemQty(itemQty1);

				double delvCharges1 = (pizzaPrice1 * 15) / 100;
				System.out.println("Delivery Charges : " + delvCharges1);
				ps1.setDelvCharges(delvCharges1);

				double totalAmt1 = (pizzaPrice1 * itemQty1) + delvCharges1;
				System.out.println("Total Price : " + totalAmt1);
				ps1.setTotalAmt(totalAmt1);
				System.out.println("Order Update SuccessFully...! For Id : " + itemId);
				System.out.println();

				entity.getTransaction().commit();

				break;

			case 3:
				System.out.println("View Order Details : ");
				System.out.println("Enter Item Id : ");
				int itemId2 = sc.nextInt();
				Pizzashop ps2 = entity.find(Pizzashop.class, itemId2);

				entity.getTransaction().begin();

				System.out.println("Item ID : " + ps2.getItemID());
				System.out.println("Item Category : " + ps2.getPizzaCatName());
				System.out.println("Price : " + ps2.getPizzaPrice());
				System.out.println("Item Quantity : " + ps2.getItemQty());
				System.out.println("Delivery Charges :" + ps2.getDelvCharges());
				System.out.println("Total Price : " + ps2.getTotalAmt());
				System.out.println();

				entity.getTransaction().commit();

				break;

			case 4:
				System.out.println("Cancel Order : ");
				System.out.println("Enter Item Id : ");
				int itemId3 = sc.nextInt();
				Pizzashop ps3 = entity.find(Pizzashop.class, itemId3);

				entity.getTransaction().begin();

				entity.remove(ps3);
				System.out.println("Order Cancel SuccessFully...! For Id : " + itemId3);
				System.out.println();

				entity.getTransaction().commit();

				break;

			case 5:
				System.out.println("View All Order Details Here : \n");
				viewAllPizzas(entity);
				System.out.println();
				break;

			default:
				System.out.println("OOPS....Enter a Valid Choice...! Please Try Again...");
				break;
			}

		}

	}

	// method to access all records in database
	public static void viewAllPizzas(EntityManager em) {
		// Create a TypedQuery to retrieve all records from the Pizzashop table
		TypedQuery<Pizzashop> query = em.createQuery("SELECT p FROM Pizzashop p", Pizzashop.class);
		List<Pizzashop> pizzaList = query.getResultList();

		// Display the results
		if (pizzaList.isEmpty()) {
			System.out.println("No records found.");
		} else {
			System.out.println("Pizza Shop Records:");
			for (Pizzashop pizza : pizzaList) {
				System.out.println(pizza);
			}
		}

	}
}
