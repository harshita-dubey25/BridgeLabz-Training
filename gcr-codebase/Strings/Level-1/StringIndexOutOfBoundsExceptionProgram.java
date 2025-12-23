import java.util.*;
public class StringIndexOutOfBoundsExceptionProgram{
	public static void customException(String s) throws StringIndexOutOfBoundsException{
		System.out.println(s.charAt(s.length()+4));
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		try{
			customException(s);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception found : "+e.toString());
		}
	}
}