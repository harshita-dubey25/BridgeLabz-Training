package foodloop;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n----------------------Welcome----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter the amount: ");
		double amount = sc.nextDouble();
		User user = new User(name, amount);
		Order res = new Order();
		
		do {
			System.out.println("Enter '1' to View Menu      :");
			System.out.println("Enter '2' to Place Order    :");
			System.out.println("Enter '3' to Cancel Order   :");
			System.out.println("Enter '4' to Get Bill       :");
			System.out.println("Enter '5' to check balance  :");
			System.out.println("Enter '6' to Exit           :");
			
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				res.details();
			}else if(n==2) {
				System.out.println("Enter the food Name");
				String foodName = sc.nextLine();
				res.order(user, foodName);
			}else if(n==3) {
				System.out.println("Enter the food Name");
				String foodName = sc.nextLine();
				res.cancel(user, foodName);
			}else if(n==4) {
				res.bill(user);
			}else if(n==5) {
			   System.out.println("\n----------------------");
			   System.out.println("Balance : "+user.getWallet());
			   System.out.println("-----------------------");
			}
			else {
				System.out.println("Hope Your Enjoyed the Meal");
				break;
			}
		}while(true);
	}
}
