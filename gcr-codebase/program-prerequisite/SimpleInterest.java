import java.util.*;

class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	int principle=sc.nextInt();
	double rate=sc.nextDouble(); 
	double time=sc.nextDouble();
	double si=(principle*rate*time)/100;
	System.out.println(si);
    }
}