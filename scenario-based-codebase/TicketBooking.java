import java.util.*;

public class TicketBooking{
	static int sleeper = 5;
	static int ac = 5;
	static int general = 5;
	static void showMenu(){
		System.out.println("Available Options :");
		System.out.println();
		System.out.println("1.Sleeper \n2.AC \n3.General");
		System.out.println();
		System.out.println("Available seats in Sleeper :"+sleeper);
		System.out.println("Available seats in AC :"+ac);
		System.out.println("Available seats in General :"+general);
		System.out.println();
		System.out.println("Enter 1 for Sleeper\nEnter 2 for AC\nEnter 3 for General\nEnter 4 to exit");
	}
	static void bookSleeper(){
		if(sleeper>0){
			sleeper--;
			System.out.println("Booking Done...");
			System.out.println("Available seats in Sleeper :"+sleeper);
			System.out.println("Available seats in AC :"+ac);
			System.out.println("Available seats in General :"+general);
			System.out.println();
			System.out.println("Enter 1 for Sleeper\nEnter 2 for AC\nEnter 3 for General\nEnter 4 to exit");
		}
		else{
			System.out.println("Seats not available!!!\nPlease try other options!");
			System.out.println("Available seats in AC :"+ac);
			System.out.println("Available seats in General :"+general);
		}
	}
	static void bookAC(){
		if(ac>0){
			ac--;
			System.out.println("Booking Done...");
			System.out.println("Available seats in AC :"+ac);
			System.out.println("Available seats in General :"+general);
			System.out.println();
			System.out.println("Enter 1 for Sleeper\nEnter 2 for AC\nEnter 3 for General\nEnter 4 to exit");
		}
		else{
			System.out.println("Seats not available!!!\nPlease try other options!");
			System.out.println("Available seats in Sleeper :"+sleeper);
			System.out.println("Available seats in General :"+general);
		}
	}
	static void bookGeneral(){
		if(general>0){
			general--;
			System.out.println("Booking Done...");
			System.out.println("Available seats in AC :"+ac);
			System.out.println("Available seats in General :"+general);
			System.out.println();
			System.out.println("Enter 1 for Sleeper\nEnter 2 for AC\nEnter 3 for General\nEnter 4 to exit");
		}
		else{
			System.out.println("Seats not available!!!\nPlease try other options!");
			System.out.println("Available seats in Sleeper :"+sleeper);
			System.out.println("Available seats in AC :"+ac);
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Ticket Reservation System");
		showMenu();
		while(true){
		int a = in.nextInt();
		if(a == 1){
			bookSleeper();
		}
		else if(a == 2){
			bookAC();
		}
		else if(a == 3){
			bookGeneral();
		}
		else{
			System.out.println("Thank you for visiting!!");
			break;
		}
		}
	}	
}