import java.util.*;
public class MultiplicationTable
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	
	if(num>=6 && num<=9 ){
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	else{
		System.out.println("Number is not between 6 and 9");
	}
}
}