import java.util.*;
public class CoffeeCounter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		while(true){
			System.out.println("1.Espresso(100) 2.Latte(120) 3.Cappuccino(140) 4.Americano(150)");
            System.out.println("5.Macchiato(160) 6.Flat White(175) 7.Mocha(180) 8.Cold Brew(200) 0.Exit");
            System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			if(choice ==0){
					System.out.println("Thank you!");
					break;
			}
			int quantity;
			double total;
			double price=0;
			switch(choice){
					case 1:
						price=100;
						break;
					case 2:
						price=120;
						break;
					case 3: 
						price=140;
						break;
					case 4:
						price =150;
						break;
					case 5:
						price=160;
						break;
					case 6:
						price =175;
						break;
					case 7:
						price = 180;
						break;
					case 8:
						price =200;
						break;
					default:
						System.out.println("Invalid choice");
						break;
			}
				System.out.print("Enter quantity: ");
						quantity = sc.nextInt();
						total = price*quantity; 
						System.out.println("Your total bill (including 18% GST): "+(total+(total*0.18)));
		}
	}
}