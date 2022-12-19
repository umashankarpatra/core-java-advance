package com.corejava.test;

public enum ProductType {

	Pant("pant"), Shirt("shirt");

	private final String description;

	private ProductType(final String description) {
		this.description = description;
	}

	public String description() {
		return this.description;
	}

}
