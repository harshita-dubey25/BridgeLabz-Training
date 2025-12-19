import java.util.*;
public class OddEvenArray
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int evenIndex = 0;
	int oddIndex = 0;
	int[] even = new int[(number/2)+1];
	int[] odd = new int[(number/2)+1];
	
	for(int i=1;i<=number;i++){
	if(i%2==0){
	even[evenIndex] = i;
	evenIndex++;
	}
	else{
	odd[oddIndex] = i;
	oddIndex++;
	}
	}
	for(int i=0;i<evenIndex;i++){
	System.out.println(even[i]);
	}
	for(int i=0;i<oddIndex;i++){
	System.out.println(odd[i]);
	}
	
}
}