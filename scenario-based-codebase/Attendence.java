import java.util.*;
public class Attendence{
	static String[] name ={"Harshita","Ansh","Arman","Bhavna","Lovely","Aditi","Parth","Kalpana","Priya","Brajesh"};
	static String[] attend = new String[10];
	
	public static void attendence(int i, char ch){
		if(ch=='a'||ch=='A'){
			attend[i] = "Absent";
		}
		else{
			attend[i] = "Present";
		}
	}
	
	public static void viewAttendence(){
		    System.out.println("-------------------");
		    System.out.println("Bus Attendence");
		for(int i =0;i<name.length;i++){
			System.out.println(i+". "+name[i]+" : "+attend[i]);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to attendence system :");
		for(int i = 0;i<name.length;i++){
			System.out.println(name[i]+"!");
			System.out.println("Present 'p' and Absent 'a'");
			char ch = sc.next().charAt(0);
			attendence(i,ch);
		}
		viewAttendence();
	}
}