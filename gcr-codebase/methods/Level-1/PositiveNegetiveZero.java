import java.util.*;
public class PositiveNegetiveZero
{
public static int findPositiveNegetiveZero(int n){
	if(n>0){
		return 1;
	}
	else if(n<0){
		return -1;
	}
	return 0;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	
	System.out.println(findPositiveNegetiveZero(number));
}
}