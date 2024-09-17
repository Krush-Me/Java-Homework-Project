package com.tka.client;

import java.util.Scanner;

import com.tka.controller.MobileController;
import com.tka.entity.Product;

public class MobileClient {

	public static void main(String[] args) {

		Product[] allproducts = new Product[7];
		Scanner sc = new Scanner(System.in);
		MobileController controller = new MobileController();

		while (true) {
			System.out.println("\nMenu");
			System.out.println("1. Add Product into database");
			System.out.println("2. Display All Products from database");
			System.out.println("3. Update Product in database");
			System.out.println("4. Delete Product from database");
			System.out.println("5. View Mobiles over 40000");
			System.out.println("6. Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();
						
			switch (choice) {				
			case 1: /* Add a Mobile */
				System.out.println(choice);

				System.out.println("Enter details to add: ");
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				System.out.println("Enter Brand: ");
				String brand = sc.next();
				System.out.println("Enter Price: ");
				int price = sc.nextInt();

				Product newProduct = new Product(id, brand, price);
				controller.addMobileController(newProduct);
				break;

			case 2: /* Display all Mobile */
				allproducts = controller.getAllMobileController();
				System.out.printf("--------------------------------------------------%n");
				System.out.printf("| %-10s | %-15s | %-15s |%n", "Product Id", "Product Brand", "Product Price");
				System.out.printf("--------------------------------------------------%n");

				/* below Scenario is for simple for & display */
//				for(int i=0; i<allproducts.length; i++) {
//					System.out.printf("| %-10s | %-15s | %-15s |%n", allproducts[i].getId() , allproducts[i].getBrand() , allproducts[i].getPrice());
//				}

				/*
				 * below Scenario is for predefined some arrays & others not or not defined
				 * anything
				 */
				for (int i = 0; i < allproducts.length; i++) {
					Product product = allproducts[i];
					if (product != null) {
						System.out.printf("| %-10s | %-15s | %-15s |%n", allproducts[i].getId(),
								allproducts[i].getBrand(), allproducts[i].getPrice());
					}
				}
				System.out.printf("--------------------------------------------------%n");
				break;

			case 3: /* Update Mobile */
				System.out.println("Enter Mobile Id to update: ");
				int updateId = sc.nextInt();
				System.out.println("Enter Brand name to be edited: ");
				String newBrand = sc.next();
				System.out.println("Enter Price to be updated: ");
				int newPrice = sc.nextInt();

				controller.updateMobileController(updateId, newBrand, newPrice);
				break;

			case 4: /* Delete Mobile */
				System.out.println(choice);
				System.out.println("Enter Mobile Id to delete: ");
				int deleteId = sc.nextInt();

				controller.deleteMobileController(deleteId);
				break;

			case 5:
				System.out.printf("%n| %-46s |%n","Mobiles Over 40000: ");
				System.out.printf("--------------------------------------------------%n");
				System.out.printf("| %-10s | %-15s | %-15s |%n", "Product Id", "Product Brand", "Product Price");
				System.out.printf("--------------------------------------------------%n");
				
				for (int i = 0; i < allproducts.length; i++) {
					Product product = allproducts[i];
					if (product != null && allproducts[i].getPrice() > 40000) {
						System.out.printf("| %-10s | %-15s | %-15s |%n", allproducts[i].getId(),
								allproducts[i].getBrand(), allproducts[i].getPrice());
					}
				}
				System.out.printf("--------------------------------------------------%n");
				break;

			case 6: /* Exit */
				break;
			default:
				System.out.println("Invalid Input...");
			}

			if (choice == 6) {
				System.out.println("Thank You");
				break;
			}
		}
		sc.close();
	}

}
