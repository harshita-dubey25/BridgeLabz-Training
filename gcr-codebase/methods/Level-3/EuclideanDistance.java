import java.util.*;
public class EuclideanDistance{
public static double findDistance(int x1, int y1, int x2, int y2){
	double ans = Math.sqrt(Math.pow((x2-x1),2))+Math.sqrt(Math.pow((y2-y1),2));
	return ans;
}
public static double[] findEquationOfLine(int x1, int y1, int x2, int y2){
	double[] ans = new double[2];
	double slope = (y2-y1)/(x2-x1);
	double intercept = y1 -(slope*x1);
	ans[0] = slope;
	ans[1] = intercept;
	return ans;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int x1 = input.nextInt();
	int x2 = input.nextInt();
	int y1 = input.nextInt();
	int y2 = input.nextInt();
	
	System.out.println("Distance: "+findDistance(x1,y1,x2,y2));
	double[] equation = findEquationOfLine(x1,y1,x2,y2);
	System.out.println("y = "+equation[0]+"x + ("+equation[1]+")");
}
}
