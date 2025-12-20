import java.util.*;
public class StudentVoteChecker
{
static public boolean canStudentVote(int age){
	if(age<0){
		return false;
	}
	else if(age>=18){
		return true;
	}
	return false;
}
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	
	int student[] = new int[10];
	for(int i=0;i<10;i++){
		student[i] = input.nextInt();
	}
	for(int i=0;i<10;i++){
		System.out.println("Can student "+(i+1)+" vote: "+canStudentVote(student[i]));
	}
} 
}