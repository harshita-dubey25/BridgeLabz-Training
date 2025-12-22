import java.util.*;

public class NumberChecker4{
	
	public static int numSize(int num){
		int cnt =0;
		while(num>0){
			cnt++;
			num/=10;
		}
		return cnt;
	}
	public static int[] digitArr(int num,int size){
		int arr[] = new int[size];
		
		while(num>0){
			arr[size-1] = num%10;
			size--;
			num/=10;
		}
		return arr;
	}
	public static int squareSum(int digit[]){
		int sm =0;
		for(int i:digit)
			sm+= (int)Math.pow(i,2);
		
		return sm;
	}
	public static boolean isHarshadNumber(int num, int[] digit){
		int sm =0;
		for(int i:digit)
			sm+=i;
		return (num%sm==0)?true:false;
	}
	public static void freqCnt(int[] arr){
		int freq[] = new int[10];
		for(int i:arr)
			freq[i]++;
		
		int ans[][]= new int[10][2];
		for(int i=0;i<10;i++){
			ans[i][0] = i;
			ans[i][1]= freq[i];
		}
		
		for(int i=0;i<10;i++)
			if(ans[i][1]!=0)
				System.out.println("Frequecy of "+ans[i][0]+" is "+ ans[i][1]);
	}
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int size = numSize(num);
		System.out.println("Size of number is: "+size);
		int digit[] = digitArr(num, size);
		System.out.println("Sum of squares of digits of number is: "+squareSum(digit));
		System.out.println(num+" is Harshad number: "+isHarshadNumber(num, digit));
		freqCnt(digit);
	}
	
}