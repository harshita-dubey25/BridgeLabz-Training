import java.util.Scanner;

public class KmToMilesInput
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	int km=input.nextInt();
	double miles=km*1.6;
	System.out.println("The total miles is "+miles+" mile for the given "+ "km");  
    }
}