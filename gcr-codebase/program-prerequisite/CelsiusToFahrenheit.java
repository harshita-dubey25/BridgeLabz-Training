import java.util.*;

class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	int celsius=sc.nextInt();
	double fahrenheit=(celsius*1.8)+ 32;
	System.out.println(fahrenheit);
    }
}