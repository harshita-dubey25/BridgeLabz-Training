import java.util.Scanner;

public class FeeDiscountInput
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float fee=input.nextFloat();// 
	float discountPercent=input.nextFloat();
	double discount=(fee*discountPercent)/100;
	double discountedFee=fee-discount;
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
    }
}