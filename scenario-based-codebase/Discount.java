import java.util.*;
public class Discount{
	static String[] product = {"Samsung s24", "Vivo x4","Iphone 17","Realme 7","Rtx 3050"};
	static double[] price = {1000,2500,750,550,765};
	static double  total =0;
	public static void show(){
		for(int i =0;i<price.length;i++){
			System.out.println("Product name = "+product[i]);
			System.out.println("Product price = "+price[i]);
			System.out.println("Enter "+i+" to add ");
		}
	}
	public static void addToCart(int i, int n){
		if((i<0)||i>price.length-1){
			System.out.println("Item not available");
			return;
		}
		total+=price[i]*n;
	}
	public static void checkout(){
		if(total>=1000&& total<5000){
			double dis = (total/100)*10;
			System.out.println("The amount "+total);
			System.out.println("The discount "+ dis);
			System.out.println("----------------------------");
			System.out.println("The final amount "+(total-dis));
			System.out.println("----------------------------");
			return;
		}
		if(total>=5000&&total<10000){
			double dis = (total/100)*20;
			System.out.println("The amount "+total);
			System.out.println("The discount "+ dis);
			System.out.println("----------------------------");
			System.out.println("The final amount "+(total-dis));
			System.out.println("----------------------------");
			return;
		}
		if(total>=10000){
			double dis = (total/100)*40;
			System.out.println("The amount "+total);
			System.out.println("The discount "+ dis);
			System.out.println("----------------------------");
			System.out.println("The final amount "+(total-dis));
			System.out.println("----------------------------");
			return;
		}
		    System.out.println("The amount "+total);
			System.out.println("The discount 0");
			System.out.println("----------------------------");
			System.out.println("The final amount "+(total));
			System.out.println("----------------------------");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Store :");
		do{
			System.out.println("Enter 's' to show list to items : ");
			System.out.println("Enter 't' to view cart amount   : ");
			System.out.println("Enter 'e' to checkout   : ");
			char ch = sc.next().charAt(0);
			if(ch=='s'){
				show();
				System.out.println("Enter the unit number of product :");
				int n = sc.nextInt();
				System.out.println("Enter the quantity               :");
				int q = sc.nextInt();
				addToCart(n,q);
			}
			if(ch=='e'){
				checkout();
				System.out.println("Thank you come again ");
				break;
			}
			if(ch=='t'){
				System.out.println("The total amount is :"+total);
			}
		}while(true);
	}
}