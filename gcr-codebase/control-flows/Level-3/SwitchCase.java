import java.util.*;

public class SwitchCase
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double var1 = input.nextDouble();
	double var2 = input.nextDouble();
	String op = input.next();
	
	switch(op){
		case "+":
		System.out.println("Addition : "+(var1+var2));
		break;
		
		case "-":
		System.out.println("Substraction : "+(var1-var2));
		break;
		
		case "*":
		System.out.println("Multiplication : "+(var1*var2));
		break;
		
		case "/":
		System.out.println("Division : "+(var1/var2));
		break;
		
		default:
		System.out.println("Invalid Operator!!!");
	}
}
}