import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryReminder{
	static int findFine(int days){
		 return days*5;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        
		int count = 0;
		while(count<5){
        System.out.print("Enter Return date (yyyy-mm-dd): ");
        String returnD = input.nextLine();
		LocalDate returnDate = LocalDate.parse(returnD);
		System.out.print("Enter Due date (yyyy-mm-dd): ");
		String dueD = input.nextLine();
		LocalDate dueDate = LocalDate.parse(dueD);
		int fine = 0;
		
		if (returnDate.isAfter(dueDate)) {
            int days = (int)ChronoUnit.DAYS.between(dueDate, returnDate);
			fine = findFine(days);
        }
		if(fine>0){
			System.out.println("Fine:"+fine);
		}
		else{
			System.out.println("Book returned. Thank you!!!");
		}
		count++;
		}
	}
}