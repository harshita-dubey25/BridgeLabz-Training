import java.util.*;
public class EmployeeSalary
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	double[] salary = new double[10];
	double[] yearOfService = new double[10];
	double[] bonusAmount = new double[10];
	double[] newSalary = new double[10];
	
	for(int i=0;i<10;i++){
		salary[i] = input.nextDouble();
		if(salary[i]<=0){
				System.out.println("Please enter a valid number");
				i--;
		}
	}
	for(int i=0;i<10;i++){
		yearOfService[i] = input.nextDouble();
		if(yearOfService[i]<=0){
				System.out.println("Please enter a valid number");
				i--;
		}
	}
	for(int i=0;i<10;i++){
		if(yearOfService[i]>5){
			bonusAmount[i] = salary[i]/20;
			newSalary[i] = salary[i]+bonusAmount[i];
		}
		else{
			bonusAmount[i] = salary[i]/50;
			newSalary[i] = salary[i]+bonusAmount[i];
		}
	}
	for(int i=0;i<10;i++){
		System.out.println("Details of Employee: "+(i+1));
		System.out.println("Old Salary: "+salary[i]);
		System.out.println("Bonus Amount: "+bonusAmount[i]);
		System.out.println("New Salary: "+newSalary[i]);
	}
	
	
	
}
}