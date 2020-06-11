package com.uma.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		ProductDetails product=new ProductDetails("Reebok", "asd", 1000.0, 12.8);
		
		Map  map=new HashMap<>();
		
		map.put(ProductType.Pant, product);
		
	}
}
