import java.util.*;
public class PositiveNegetiveZero
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	float number = input.nextFloat();
				
	if(number>0)		{
	System.out.println("Positive");
	}
	else if(number<0){
	System.out.println("Negetive");
	}
	else{
	System.out.println("Zero");
	}
}
}
