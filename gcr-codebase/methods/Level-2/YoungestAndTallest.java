import java.util.*;
public class YoungestAndTallest
{
public static String findYoungest(float[] age){
	float youngest = age[0];
	int y=0;
	for(int i=1;i<3;i++){
		if(age[i]<youngest){
			youngest = age[i];
			y=i;
		}
	}
	if(y==0){
		return "Amar is youngest.";
	}
	else if(y==1){
		return "Akbar is youngest";
	}
	return "Anthony is youngest.";
}
public static String findTallest(float[] height){
	float tallest = height[0];
	int t=0;
	for(int i=1;i<3;i++){
		if(height[i]>tallest){
			tallest = height[i];
			t=i;
		}
	}
	if(t==0){
		return "Amar is tallest.";
	}
	else if(t==1){
		return "Akbar is tallgest";
	}
	return "Anthony is tallgest.";
}
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
	System.out.println(findYoungest(age));
	System.out.println(findTallest(height));
}
}