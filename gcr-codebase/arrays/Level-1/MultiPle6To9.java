import java.util.*;
public class MultiPle6To9
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int[] multiplicationResult = new int[10];
	
	if(number<6 || number>9){
	System.out.println("Invalid Number!!!");
	System.exit(0);
	}
	for(int i=0;i<10;i++){
	multiplicationResult[i] = number*(i+1);
	System.out.println(number+" * "+(i+1)+" = "+multiplicationResult[i]);
	}
	
}
}