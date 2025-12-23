import java.util.*;

public class ArrayIndexOutOfBoundsExceptionProgram{
	public static void generateExcemtion(int arr[], int index) throws ArrayIndexOutOfBoundsException{
		System.out.println(arr[index]);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		int i = input.nextInt();
		try{
			generateExcemtion(arr, i);
		}
		catch( ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occured: "+e.toString());
		}
	}
}