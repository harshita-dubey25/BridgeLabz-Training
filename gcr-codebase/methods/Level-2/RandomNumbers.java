import java.util.*;
public class RandomNumbers
{
public static int[] generate4DigitRandomArray(int size){
	int[] arr = new int[size];
	for(int i=0;i<size;i++){
		arr[i] = (int)(Math.random()*9000);
	}
	return arr;
}
public static double[] findAverageMinMax(int[] numbers){
	double[] arr = new double[3];	
	double average = 0;
	double minimum = Integer.MAX_VALUE;
	double maximum = Integer.MIN_VALUE;
	for(int i=0;i<numbers.length;i++){
		average+=numbers[i];
		minimum=Math.min(minimum,numbers[i]);
		maximum=Math.max(maximum,numbers[i]);
	}
	arr[0] = average/numbers.length;
	arr[1] = minimum;
	arr[2] = maximum;
	
	return arr;
}
public static void main(String[] args)
{
	int[] numbers = generate4DigitRandomArray(5);
	double[] answer = findAverageMinMax(numbers);
	System.out.println(Arrays.toString(numbers));
	System.out.println(Arrays.toString(answer));
}
}