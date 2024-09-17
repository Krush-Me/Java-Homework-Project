package com.tka.controller;

import com.tka.entity.Product;
import com.tka.service.MobileService;

public class MobileController {
	MobileService service = new MobileService();

	public Product[] getAllMobileController() {
		return service.getAllProductService();
	}

	public void addMobileController(Product product) {
		service.addProductService(product);
	}

	public void updateMobileController(int id, String newBrand, int newPrice) {
		service.updateProductService(id, newBrand, newPrice);
	}

	public void deleteMobileController(int id) {
		service.deleteProductService(id);
	}

}
