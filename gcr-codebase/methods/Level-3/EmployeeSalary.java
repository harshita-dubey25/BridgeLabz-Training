import java.util.*;
public class EmployeeSalary{
public static float[][] createData(){
	float[][] table = new float[10][2];
	for(int i=0;i<10;i++){
		table[i][0] = (int)(Math.random()*90000+10000);
		table[i][1] = (int)(Math.random()*90+10);
	}
	return table;
}
public static float[][] findNewSalaryAndBonus(float[][] arr){
	float[][] salaryAndBonus = new float[10][2];
	for(int i=0;i<10;i++){
		if(arr[i][1]>5){
			salaryAndBonus[i][1] = arr[i][0]/20;
			salaryAndBonus[i][0] = arr[i][0]+salaryAndBonus[i][1];
		}
		else{
			salaryAndBonus[i][1] = arr[i][0]/50;
			salaryAndBonus[i][0] = arr[i][0]+salaryAndBonus[i][1];
		}
	}
	return salaryAndBonus;
}
public static float[][] findSum(float[][] arr1, float[][] arr2){
	float[][] ans = new float[1][3];
    for(int i=0;i<10;i++){
		ans[0][0] += arr1[i][0];
		ans[0][1] += arr2[i][0];
		ans[0][2] += arr2[i][1];
	}
	return ans;
}
public static void displayData(float[][] arr){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	float[][] dataSheet = createData();
	displayData(dataSheet);
	System.out.println();
	float[][] newData = findNewSalaryAndBonus(dataSheet);
	displayData(newData);
	System.out.println();
	float[][] finalData = findSum(dataSheet,newData);
	displayData(finalData);
	System.out.println();
}
}