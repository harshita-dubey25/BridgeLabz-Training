import java.util.*;
public class Fare{
	
	static int smartBalance = 1000;
		
	static int calculareFare(int d){
		int fare = (d<=100)?80:150;
		return fare;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int distance = input.nextInt();
		int fare =calculareFare(distance);
		while(smartBalance>0 && fare<=smartBalance){
			System.out.println("Ride booked...");
			smartBalance = smartBalance -calculareFare(distance);
			distance = input.nextInt();
			fare =calculareFare(distance);	
		}
		System.out.println("You don't have enough money!!!");
	}
}