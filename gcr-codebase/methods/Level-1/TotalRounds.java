import java.util.*;
public class TotalRounds
{
public static int findRounds(int s1, int s2, int s3){
	int perimeter = s1+s2+s3;
	int distance = 5*1000;
	if(distance%perimeter==0){
		return distance/perimeter;
	}
	return (distance/perimeter)+1;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int side1 = input.nextInt();
	int side2 = input.nextInt();
	int side3 = input.nextInt();
	
	System.out.println(findRounds(side1,side2,side3));
}
}