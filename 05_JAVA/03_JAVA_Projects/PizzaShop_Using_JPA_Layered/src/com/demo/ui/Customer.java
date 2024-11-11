package com.demo.ui;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Pizzashop;
import com.demo.service.PizzashopService;
import com.demo.service.PizzashopServiceImpl;

public class Customer {

	public static void main(String[] args) {

		PizzashopService service = new PizzashopServiceImpl();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("**** Pizza Shop ****");
			System.out.println("1. Place Order ");
			System.out.println("2. Update Order ");
			System.out.println("3. View Order ");
			System.out.println("4. Cancel Order ");
			System.out.println("5. View All Orders");
			System.out.print("Enter Choice: ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				Pizzashop ps = new Pizzashop();
				System.out.println("Enter Pizza Category");
				ps.setPizzaCatName(sc.next());
				System.out.print("Enter Pizza Price: ");
				ps.setPizzaPrice(sc.nextInt());
				System.out.print("Enter Quantity: ");
				ps.setItemQty(sc.nextInt());
				ps.setDelvCharges(ps.getPizzaPrice() * 0.15);
				ps.setTotalAmt(ps.getPizzaPrice() * ps.getItemQty() + ps.getDelvCharges());
				int orderId = service.placeOrder(ps);
				System.out.println("Order placed successfully with ID: " + orderId);
				break;

			case 2:
				System.out.print("Enter Item ID to update: ");
				int updateId = sc.nextInt();
				Pizzashop updatedPizza = new Pizzashop();
				System.out.print("Enter Pizza Category: ");
				updatedPizza.setPizzaCatName(sc.next());
				System.out.print("Enter Pizza Price: ");
				updatedPizza.setPizzaPrice(sc.nextInt());
				System.out.print("Enter Quantity: ");
				updatedPizza.setItemQty(sc.nextInt());
				updatedPizza.setDelvCharges(updatedPizza.getPizzaPrice() * 0.15);
				updatedPizza.setTotalAmt(
						updatedPizza.getPizzaPrice() * updatedPizza.getItemQty() + updatedPizza.getDelvCharges());
				service.updateOrder(updateId, updatedPizza);
				System.out.println("Order updated successfully for ID: " + updateId);
				break;

			case 3:
				System.out.print("Enter Item ID to view: ");
				int viewId = sc.nextInt();
				Pizzashop pizza = service.viewOrder(viewId);
				System.out.println(pizza);
				break;

			case 4:
				System.out.print("Enter Item ID to cancel: ");
				int cancelId = sc.nextInt();
				service.cancelOrder(cancelId);
				System.out.println("Order cancelled successfully for ID: " + cancelId);
				break;

			case 5:
				List<Pizzashop> pizzas = service.viewAllOrders();
				for (Pizzashop pizzaa : pizzas) {
					System.out.println(pizzaa);
				}

				break;

			default:
				System.out.println("Invalid choice, please try again.");
				break;
			}
			


		}
		
		

	}
	
	
}
