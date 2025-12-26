package com.classandobject.level1;

public class ItemsDetails {

	public static void main(String[] args) {
		String[] itemName= {"Water bottle","Rice","blackboard"};
		String[] itemCode= {"01AA","01BB","02AA"};
		double[] price= {500,700,400};
		Items item1 = new Items(itemName, itemCode,price );
		
		for (int i = 0; i < price.length; i++) {
			item1.displayItems(i);
		}
	}
}
