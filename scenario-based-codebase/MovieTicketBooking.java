import java.util.*;

public class MovieTicketBooking{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String customer = "Yes";
		 while(customer.equals("Yes") || customer.equals("yes")){
			 int amount = 0;
			 System.out.println("Select Movie genre:");
			 System.out.println("1.Action\n2.Comedy\n3.Romantic\n4.Horror");
			 System.out.println("Enter your choice");
			 
			 int movie = input.nextInt();
			 
			 switch(movie){
				 case 1:
					amount+=100;
					break;
				 case 2:
					amount+=150;
					break;
				case 3:
					amount+=180;
					break;
				case 4:
					amount+=200;
					break;
				default:
					System.out.println("Invalid choice!!!");
			 }
			 
			 System.out.println("Seats Available:\n1.Silver\n2.Gold");
			 System.out.println("Enter your choice - 1 or 2");
			 int movieType = input.nextInt();
			 
			 if(movieType==1){
				 amount+=200;
			 }
			 else if(movieType==2){
				 amount+=300;
			 }
			 
			 System.out.println("Which snacks do you want to add?");
			 System.out.println("1.Popcorn\n2.Nachos\n3.Chips");
			 System.out.println("Enter your choice");
			 int snacks = input.nextInt();
			 
			 switch(snacks){
				 case 1:
					amount+=25;
					break;
				 case 2:
					amount+=30;
					break;
				 case 3:
					amount+=35;
					break;
				 default:
					System.out.println("Invalid Option!!!");
			 }
			 System.out.println("Total Amount: "+amount);
			 
			 System.out.println();
			 System.out.println("Do you want to book one more? Type Yes/No");
			 customer = input.next();
		 }
		System.out.println("Thank you!!!\nVisit again.");
	}
}