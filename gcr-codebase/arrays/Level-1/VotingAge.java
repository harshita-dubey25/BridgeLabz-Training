import java.util.*;
public class VotingAge
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int[] arrAge = new int[10];
	
	for(int i=0;i<arrAge.length;i++){
	arrAge[i] = input.nextInt();	
	}
	for(int i=0;i<arrAge.length;i++){
	if(arrAge[i]<0){
	System.out.println("Invalid Age");
	}	
	else if(arrAge[i]>=18){
	System.out.println(" The student with the age "+arrAge[i]+" can vote.");
	}
	else{
	System.out.println(" The student with the age "+arrAge[i]+" cannot vote.");
	}
	}
}
}