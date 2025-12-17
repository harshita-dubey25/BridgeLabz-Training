import java.util.*;

public class Height
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float height=input.nextFloat();
        double heightInInches=height/2.54;
	double heightInFeet=heightInInches/12;
	System.out.println("Your Height in cm is "+height+ " while in feet is "+ heightInFeet+" and inches is "+heightInInches);
    }
}