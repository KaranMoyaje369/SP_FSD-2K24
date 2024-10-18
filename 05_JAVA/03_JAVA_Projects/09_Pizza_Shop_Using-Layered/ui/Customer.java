package com.pizzashop.ui;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.pizzashop.model.PizzaShop;
import com.pizzashop.service.PizzaServiceImpl;
import com.pizzashop.service.PizzaServices;

public class Customer {

	public static void main(String[] args) {

		// object creation of service layer

		PizzaServices pizzaService = new PizzaServiceImpl();

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
				System.out.println("Order Details : ");
				System.out.print("Enter Pizza Category : ");
				String PizzaCatName = sc.next();
				System.out.print("Enter price for Pizza : ");
				int pizzaPrice = sc.nextInt();
				System.out.print("Enter Item Quantity : ");
				int itemQty = sc.nextInt();
				double delvCharges = (pizzaPrice * 15) / 100;
				System.out.println("Delivery Charges : " + delvCharges);
				double totalAmt = pizzaPrice + delvCharges;
				System.out.println("Total Price : " + totalAmt);

				PizzaShop ps = new PizzaShop(PizzaCatName, pizzaPrice, itemQty, delvCharges, totalAmt);
				int orderId = pizzaService.placeOrder(ps);

				System.out.println("Order Placed SuccessFully...! For Order Id : " + orderId);
				System.out.println();
				break;

			case 2:
				System.out.println("Order Update Process : ");
				System.out.println("Enter Item Id :  ");
				int itemId = sc.nextInt();
				System.out.print("Enter Pizza Category : ");
				String PizzaCatName1 = sc.next();
				System.out.print("Enter price for Pizza : ");
				int pizzaPrice1 = sc.nextInt();
				System.out.print("Enter Item Quantity : ");
				int itemQty1 = sc.nextInt();
				double delvCharges1 = (pizzaPrice1 * 15) / 100;
				System.out.println("Delivery Charges : " + delvCharges1);
				double totalAmt1 = pizzaPrice1 + delvCharges1;
				System.out.println("Total Price : " + totalAmt1);

				PizzaShop ps1 = new PizzaShop(PizzaCatName1, pizzaPrice1, itemQty1, delvCharges1, totalAmt1);
				pizzaService.updateOrder(itemId, ps1);

				System.out.println("Order Update SuccessFully...! For Id : " + itemId);
				System.out.println();
				break;

			case 3:
				System.out.println("View Order Details : ");
				System.out.println("Enter Item Id : ");
				int itemId2 = sc.nextInt();
				PizzaShop obj1 = pizzaService.viewOrder(itemId2);
				System.out.println(obj1);
				System.out.println();
				break;

			case 4:
				System.out.println("Cancel Order : ");
				System.out.println("Enter Item Id : ");
				int itemId3 = sc.nextInt();

				pizzaService.cancelOrder(itemId3);
				System.out.println("Order Cancel SuccessFully...! For Id : " + itemId3);
				System.out.println();
				break;

			case 5:
				System.out.println("View All Order Details Here : \n");
				Set<Entry<Integer, PizzaShop>> result = pizzaService.viewAllOrder();
				Iterator<Entry<Integer, PizzaShop>> itr = result.iterator();

				while (itr.hasNext()) {
					Entry<Integer, PizzaShop> finalRes = itr.next();
					System.out.println(finalRes.getKey() + " " + finalRes.getValue());
				}
				System.out.println();
				break;

			default:
				System.out.println("OOPS....Enter a Valid Choice...! Please Try Again...");
				System.out.println();
				break;

			}
		}
	}
}
