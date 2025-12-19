import java.util.*;
public class FizzBuzz
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	String[] fizzBuzz = new String[number+1]; 
	
	if(number<=0){
		System.out.println("Invalid Number");
		System.exit(0);
	}
	for(int i=0;i<=number;i++){
		if(i%3==0 && i%5==0){
			fizzBuzz[i]="FizzBuzz";
		}
		else if(i%3==0){
			fizzBuzz[i]="Fizz";
		}
		else if(i%5==0){
			fizzBuzz[i]="Buzz";
		}
		else{
			fizzBuzz[i]=""+i;
		}
	}
	for(int i=0;i<=number;i++){
		System.out.println(fizzBuzz[i]);
	}
}
}