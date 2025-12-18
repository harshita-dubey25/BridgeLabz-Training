import java.util.*;
public class EmployeeBonus
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	float salary = input.nextFloat();
	float yearOfExperience = input.nextInt();
	
	float bonusAmount=0;
	
	if(yearOfExperience>5){
		bonusAmount = salary/20;
	}
	
	System.out.println(bonusAmount);
}
}