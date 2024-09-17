package com.tka.service;

import com.tka.dao.MobileDao;
import com.tka.entity.Product;

public class MobileService {
	MobileDao dao = new MobileDao();

	public Product[] getAllProductService() {
		return dao.getAllMobileDao();
	}

	public void addProductService(Product product) {
		dao.addMobileDao(product);
	}

	public void updateProductService(int id, String newBrand, int newPrice) {
		dao.updateMobileDao(id, newBrand, newPrice);
	}

	public void deleteProductService(int id) {
		dao.deleteMobileDao(id);
	}
	
}
