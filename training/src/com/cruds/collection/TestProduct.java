package com.cruds.collection;

import java.util.HashSet;
import java.util.Set;

public class TestProduct {
	
	public static void main(String[] args) {
		
		Set<Product> prods = new HashSet<>();
		prods.add(new Product(101, "Oppo Phone", 3456.00));
		prods.add(new Product(222, "Samsung Phone", 5667.00));
		prods.add(new Product(333, "Xiaomi Phone", 6543.00));
		prods.add(new Product(333, "Xiaomi Phone", 6543.00));


		for(Product p : prods)
		{
			System.out.println(p);
		}
		
	}

}
