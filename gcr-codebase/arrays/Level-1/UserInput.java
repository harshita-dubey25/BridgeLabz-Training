import java.util.*;
public class UserInput
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int[] arr = new int[10];
	int num ;
	int i=0;
	int sum=0;
	
	while(true){
	if(i<10){
	num = input.nextInt();
	if(num>0){
	arr[i] = num;
	sum+=arr[i];
	i++;
	}
	else{
	break;
	}
	}
	else{
		break;
	}
	}
	for(int j=0;j<arr.length;j++){
	if(arr[j]==0){
	break;
	}
	System.out.println(arr[j]);
	}
	System.out.println(sum);
}
}