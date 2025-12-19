import java.util.*;
public class FactorArray
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int maxFactor = 10;
	int index = 0;
	int[] temp;
	int[] factorArray = new int[maxFactor];
	
	for(int i=1;i<=number;i++){
		if(number%i==0){
			if(index==maxFactor){
				maxFactor*=2;
				temp = new int[maxFactor];
				for(int j=0;j<index;j++){
					temp[j] = factorArray[j];
				}
				factorArray=temp;
				factorArray[index]  = i;
				index++;
			}
		else{
			factorArray[index]  = i;
			index++;
		}
		}
	}
	for(int j=0; j<index;j++){
		if(factorArray[j]==0){
		break;
		}
		System.out.println(factorArray[j]);
	}
	
	
}
}