import java.util.*;
public class MultiplicationTable
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int[] arrTable = new int[10];
	
	for(int i=0;i<arrTable.length;i++){
	arrTable[i] =number*(i+1);
	}
	for(int i=0;i<arrTable.length;i++){
	System.out.println(number+" * "+(i+1)+" = "+arrTable[i]);	
	}
}
}