import java.util.*;

public class DoubleOpt
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	float a=input.nextFloat();
	float b=input.nextFloat();
        float c=input.nextFloat();
        float ans1=a+b*c;
	float ans2=a*b+c;
	float ans3=c+a/b;
	float ans4=a%b+c;
	System.out.println("The result of Int Operations are "+ans1+","+ans2+","+ans3+", and "+ans4);
    }
}