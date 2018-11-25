package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> shoppingCartList;

	public ShoppingCart() {
		shoppingCartList = new ArrayList<Product>();
	}
	
	public List<Product> getShoppingCartList() {
		return shoppingCartList;
	}
	
	public void addProductToShoppingCart(Product product) {
		shoppingCartList.add(product);
	}
	

}
