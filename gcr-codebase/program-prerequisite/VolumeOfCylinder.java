import java.util.*;

class VolumeOfCylinder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	final double PI=3.14;
	double radius=sc.nextInt();
	double height=sc.nextInt(); 
	double volume=PI*radius*radius*height;
	System.out.println(volume);
    }
}