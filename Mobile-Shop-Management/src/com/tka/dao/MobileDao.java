package com.tka.dao;

import com.tka.entity.Product;

public class MobileDao {

	public Product[] allproducts = new Product[7];
	// public int count = 0; /* if defined nothing or Defined few arrays */
	public int count = 5; /* if predefined numbers(i.e. Here 5) of array */

//	public MobileDao() {		/*	1st scenario: PreDdefined all Arrays	*/
//		allproducts[0] = new Product(1, "Samsung", 50000);
//        allproducts[1] = new Product(2, "Apple", 100000);
//        allproducts[2] = new Product(3, "OnePlus", 45000);
//        allproducts[3] = new Product(4, "Xiaomi", 30000);
//        allproducts[4] = new Product(5, "Vivo", 25000);
//        allproducts[5] = new Product(6, "Nokia", 49000);
//        allproducts[6] = new Product(7, "Nothing", 15000);
//	}

	public MobileDao() { 		/* 2nd scenario: PreDdefined 5 arrays & should change in case 2 also */
		allproducts[0] = new Product(1, "Samsung", 50000);
		allproducts[1] = new Product(2, "Apple", 100000);
		allproducts[2] = new Product(3, "OnePlus", 45000);
		allproducts[3] = new Product(4, "Xiaomi", 30000);
		allproducts[4] = new Product(5, "Vivo", 25000);
	}

	public Product[] getAllMobileDao() {
		return allproducts;
	}

	public void addMobileDao(Product product) {
		if (count < allproducts.length) {
			allproducts[count++] = product;
			System.out.println("Added successfully");
		} else {
			System.out.println("Invalid entry");
		}
	}

	public void updateMobileDao(int id, String newBrand, int newPrice) {
		for (int i = 0; i < allproducts.length; i++) {
			if (allproducts[i] != null && allproducts[i].getId() == id) {
				allproducts[i].setBrand(newBrand);
				allproducts[i].setPrice(newPrice);
				System.out.println("Successfully Updated");
				return;
			}
		}
		System.out.println("Product not found.");
	}

	public void deleteMobileDao(int id) {
		for (int i = 0; i < allproducts.length; i++) {
			if (allproducts[i] != null && allproducts[i].getId() == id) {
				allproducts[i] = null;
				System.out.println("Mobile Deleted Successfully");
				return;
			}
		}
		System.out.println("Product not found.");
	}

	
}
