import java.util.*;
public class Fitness{
	static float findAveragePushUps(int[] arr){
		float sum = 0;
		for(int a:arr){
			if(a == 0){
				continue;
			}
			sum+=a;
		}
		sum = sum/(arr.length);
		return sum;
	}
	static float findTotal(int[] arr){
		int sum = 0;
		for(int a:arr){
			if(a == 0){
				continue;
			}
			sum+=a;
		}
		return sum;
	}
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int pushUps[] = new int[7];
		
		System.out.println("Enter No of Push-ups for 7 days:");
		
		for(int i=0;i<7;i++){
			pushUps[i] = input.nextInt();
		}
		float average = findAveragePushUps(pushUps);
		float total = findTotal(pushUps);
		System.out.println("Average : "+average);
		System.out.println("Total :"+total);
	}
}