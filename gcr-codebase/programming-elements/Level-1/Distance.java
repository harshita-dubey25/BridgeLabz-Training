import java.util.*;

public class Distance
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	int distanceInfeet=input.nextInt();
	float distanceInyard=distanceInfeet/3;
	float distanceInmile=distanceInyard/1760;
	System.out.println("Your distance in feet is "+distanceInfeet+" while in yard is "+distanceInyard+" and inches is "+distanceInmile);
    }
}