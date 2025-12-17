import java.util.*;

public class QuotientRemainder
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float num1=input.nextFloat();
	float num2=input.nextFloat();
	float quotient=num1/num2;
	float remainder=num1%num2;
	System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
    }
}