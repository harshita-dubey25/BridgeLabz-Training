class FeeDiscount
{
    public static void main(String[] args)
    {
        int fee=125000;
        int discountPercent=10;
	int discount=fee/10; // discount amont that is given
	int payableAmount=fee-discount;// to get the fee amount to pay
	System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+payableAmount );
    }
}