import java.util.*;
public class OddOrEven
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number =input.nextInt();
	
	if(number>0){
	for(int i=1;i<=number;i++){
	if(i%2==0){
		System.out.println(i+" is Even Number");
	}
	else{
		System.out.println(i+" is Odd Number");
	}
	}
	}
	else{
		System.out.println("Not a Natural Number");
	}
}
}