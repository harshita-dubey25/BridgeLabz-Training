import java.util.*;
public class Temperature{
	static float findAverageTemp(float[] arr){
		float sum = 0;
		for(float a:arr){
			sum+=a;
		}
		sum/=(arr.length);
		return sum;
	}
	static float findMaxTemp(float[] arr){
		float max = 0;
		for(float a:arr){
			if(a>max){
				max = a;
			}
		}
		return max;
	}
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		float temperature[] = new float[10];
		
		System.out.println("Enter temperature for 10 days in celsius:");
		
		for(int i=0;i<10;i++){
			temperature[i] = input.nextFloat();
		}
		float averageTemperature = findAverageTemp(temperature);
		float maxTemperature = findMaxTemp(temperature);
		System.out.println("Average Temperature: "+averageTemperature);
		System.out.println("Maximum Temperature:"+maxTemperature);
	}
}