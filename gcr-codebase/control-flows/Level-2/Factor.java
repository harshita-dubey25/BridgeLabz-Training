import java.util.*;
public class Factor
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num = input.nextInt();
	
	if(num<=0){
	System.out.println("Not a valid Input");
	}
	for(int i=1;i<num;i++){
	if(num%i==0){
	System.out.println(i);
	}
	}
}
}