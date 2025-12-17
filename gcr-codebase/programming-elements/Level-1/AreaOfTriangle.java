import java.util.*;

public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	float base=input.nextFloat();
	float height=input.nextFloat();
	double areaInCm=0.5*base*height;
	double areaInInches=areaInCm/2.54;
	System.out.println("The area of triangle in cm is "+areaInCm+" and in inches is "+areaInInches);
    }
}