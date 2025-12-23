
import java.util.*;

public class NumberFormatExceptionProgram{
	public static int generateException(String s) throws NumberFormatException{
		int x = Integer.parseInt(s);
		return x;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st = input.next();
		try{
			generateException(st);
		}
		catch(NumberFormatException e){
			System.out.println("Exception occured: "+e.toString());
		}
	}
}
