import java.util.*;
public class MeanHeight
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double[] arr = new double[11];
	double sum = 0;
	
	for(int i=0;i<arr.length;i++){
	arr[i] = input.nextDouble();
	sum+=arr[i];
	}
	System.out.println(sum/11);
}
}