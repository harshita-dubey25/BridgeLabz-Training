import java.util.*;

public class TotalPrice
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	float unitPrice=input.nextFloat();
	int quantity=input.nextInt();
	float totalPrice=unitPrice*quantity;
	System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
    }
}