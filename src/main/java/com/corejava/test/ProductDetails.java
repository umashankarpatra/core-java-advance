package com.corejava.test;

public class ProductDetails {
	
    private ProductType productType;

	private String name;
	
	private String clientName;
	
	private double price;
	
	private double size;
	
	public ProductDetails(String name, String clientName, double price, double size,ProductType productType) {
		super();
		this.name = name;
		this.clientName = clientName;
		this.price = price;
		this.size = size;
		this.productType=productType;
	}

}
