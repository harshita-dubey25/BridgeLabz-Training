import java.util.*;

public class IllegalArgumentExceptionProgram{
	public static void illegalExcep(String s,int st, int ed) throws IllegalArgumentException{
		if(st>ed){
			throw new IllegalArgumentException();
		}
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		try{
			illegalExcep(s,5,4);
		}
		catch(IllegalArgumentException e){
			System.out.print("Exception generated: "+e);
		}
			
	}
}