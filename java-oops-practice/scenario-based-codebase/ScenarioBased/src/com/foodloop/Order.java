package foodloop;

import java.util.ArrayList;

public class Order {
	ArrayList<FoodItem> foodlist = new ArrayList<>();
	
	public Order() {
		foodlist.add(new VegItem("Paneer Tikka Masala","Veg",true,150));
		  foodlist.add(new VegItem("Paneer Kolhapuri","Veg",true,350));
		  foodlist.add(new VegItem("Chole Bhatore","Veg",true,40));
		  foodlist.add(new NonVegItem("Chicken Tikka","Non-Veg",true,450));
		  foodlist.add(new NonVegItem("Chicken Biryani","Non-Veg",true,70));
		  foodlist.add(new VegItem("Gajar Ka Halwa","Veg",true,150));
	}
	
	public void order(User user, String name) {
		for(FoodItem food: foodlist) {
			if(food.getName().equalsIgnoreCase(name)) {
				if(user.getWallet()>=food.getPrice()) {
					if(food.isAvailable()) {
						user.addItem(food);
						food.setAvailability(false);
						user.setWallet(user.getWallet()-food.getPrice());
						return;
					}
					else {
						System.out.println("Food not available");
						return;
					}
				}
				else {
					System.out.println("Not enough balance");
					return ;
				}
			}
		}
		System.out.println("Food Item Not Found");
	}
	
	public void cancel(User user, String name) {
		for(FoodItem food: foodlist) {
			if(food.getName().equalsIgnoreCase(name)) {
				if(user.cancelItem(name)) {
					food.setAvailability(true);
					user.setWallet(user.getWallet()+food.getPrice());
					return;
				}else {
					return;
				}
			}
		}
		System.out.println("Food Item not found");
	}
	
	public void details() {
		double sum = 0;
		for(FoodItem list: foodlist) {
			list.display();
		}
	}
	
	public void bill(User user) {
		double sum =0;
		
		for(FoodItem food: user.foodItem) {
			food.display();
			sum+=food.getPrice();
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Total amount    : "+sum);
		System.out.println("Discount        : "+((sum/100)*15));
		System.out.println("Final amount    : "+(sum - ((sum/100)*15)));
		System.out.println("---------------------------------------");
	}
}