package com.tka.entity;

public class Product {

	private int id;
	private String brand;
	private int price;

	public Product() {
		super();
	}

	public Product(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", price=" + price + "]";
	}

}
