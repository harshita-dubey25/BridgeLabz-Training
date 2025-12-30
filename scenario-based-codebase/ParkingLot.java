import java.util.*;

public class ParkingLot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = 100;
		boolean user = true;
		while(user){
			if(size ==0)
				break;
			
			System.out.println("1.Park, 2.Exit, 3.Show Occupancy");
			System.out.print("Enter your choice(1,2,3): ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1: 
					System.out.println("Sucessfully parked!");
					size-=1;
					break;
				case 2:
					user = false;
					System.out.println("Sucessfully exited!");
					break;
				case 3:
					System.out.println("Occupied placed out of 100: "+(100-size));
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}