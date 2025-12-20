import java.util.*;
public class QuadraticRoots
{
public static double[] roots(int a, int b, int c){
	double arr[] = new double[2];
	double delta = Math.pow(b,2)-(4*a*c);
	if(delta>0){
		arr[0] = ((-b) + Math.sqrt(delta))/(2*a);
		arr[1] = ((-b) - Math.sqrt(delta))/(2*a);
	}
	else if(delta<0){
		arr[0] = (-b/(2*a));
	}
	return arr;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	double[] answer = roots(a,b,c);
	System.out.println(Arrays.toString(answer));
}
}