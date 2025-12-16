import java.util.*;

class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	final double PI=3.14;
	int radius=sc.nextInt();
	double area=PI*radius*radius;
	System.out.println(area);
    }
}