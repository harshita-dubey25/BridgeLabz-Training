import java.util.*;

public class NullPointerExceptionProgram{
	public static void generateException() throws NullPointerException{
		String text = null;
		try{
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception");
			System.out.println("Exception found: "+e.toString());
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		generateException();
	}
}