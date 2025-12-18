import java.util.*;
public class AgeAndHeight
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int amarAge = input.nextInt();
	int akbarAge = input.nextInt();
	int anthonyAge = input.nextInt();
	int amarHeight = input.nextInt();
	int akbarHeight = input.nextInt();
	int anthonyHeight = input.nextInt();
	
	if(amarAge<akbarAge && amarAge<anthonyAge){
	System.out.println("Amar is youngest");
	}
	else if(akbarAge<anthonyAge){
	System.out.println("Akbar is youngest");
	}
	else{
	System.out.println("Anthony is youngest");
	}
	if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
	System.out.println("Amar is tallest");
	}
	else if(akbarHeight>anthonyHeight){
	System.out.println("Akbar is tallest");
	}
	else{
	System.out.println("Anthony is tallest");
	}
}
}