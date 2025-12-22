import java.util.*;
public class OTP{
public static int generateOTP(){
	int otp = (int)(Math.random()*900000+100000);
	return otp;
}
public static int[] storeOTP(){
	int arr[] = new int[10];
	for(int i=0;i<10;i++){
		arr[i] = generateOTP();
	}
	return arr;
}
public static void displayData(int[] arr){
	for(int i=0;i<10;i++){
		System.out.println(arr[i]);
	}
}
public static boolean isSame(int[] arr){
	for(int i=1;i<10;i++){
		if(arr[i]==arr[i-1]){
			return false;
		}
	}
	return true;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int ans[] = storeOTP();
	displayData(ans);
	System.out.println("Are all the OTPs different? "+isSame(ans));
}
}