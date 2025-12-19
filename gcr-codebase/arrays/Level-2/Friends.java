import java.util.*;
public class Friends
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	float[] age = new float[3];
	float[] height = new float[3];
	
	for(int i=0;i<3;i++){
		age[i] = input.nextFloat();
	}
	for(int i=0;i<3;i++){
		height[i] = input.nextFloat();
	}
	
	float youngest = age[0];
	float tallest = height[0];
	int y=0;
	int t=0;
	
	for(int i=1;i<3;i++){
		if(age[i]<youngest){
			youngest = age[i];
			y=i;
		}
		if(height[i]>tallest){
			tallest = height[i];
			t=i;
		}
	}
	if(y==0){
		System.out.println("Amar is Youngest");
	}
	else if(y==1){
		System.out.println("Akbar is Youngest");
	}
	else{
		System.out.println("Anthony is Youngest");
	}
	if(t==0){
		System.out.println("Amar is Tallest");
	}
	else if(t==1){
		System.out.println("Akbar is Tallest");
	}
	else{
		System.out.println("Anthony is Tallest");
	}
	
}
}