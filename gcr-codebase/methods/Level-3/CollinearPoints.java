import java.util.*;
public class CollinearPoints{
public static boolean findByFormula(int x1, int y1, int x2, int y2,int x3, int y3){
	double slope1 = (y2-y1)/(x2-x1);
	double slope2 = (y3-y2)/(x3-x2);
	double slope3 = (y3-y1)/(x3-x1);
	if(slope1==slope2 && slope2==slope3){
	return true; 
	}
	return false;
}
public static boolean findByAreaOfTriangle(int x1, int y1, int x2, int y2,int x3, int y3){
	double area =0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
	if(area==0){
		return true;
	}
	return false;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int x1 = input.nextInt();
	int y1 = input.nextInt();
	int x2 = input.nextInt();
	int y2 = input.nextInt();
	int x3 = input.nextInt();
	int y3 = input.nextInt();
	
	System.out.println("Checking collinearity by formula: "+findByFormula(x1,y1,x2,y2,x3,y3));
	System.out.println("Checking collinearity by Area of Triangle: "+findByAreaOfTriangle(x1,y1,x2,y2,x3,y3));
}
}
