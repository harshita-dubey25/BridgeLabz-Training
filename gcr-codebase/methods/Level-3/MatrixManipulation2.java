import java.util.*;
public class MatrixManipulation2{
public static float[][] createMatrix(int r, int c){
	float arr[][] = new float[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			arr[i][j] = (int)(Math.random()*10);
		}
	}
	return arr;
}
public static void displayMatrix(float[][] arr){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
public static float[][] matrixAddition(float[][] arr1, float[][] arr2){
	float arr[][] = new float[arr1.length][arr1[0].length];
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr[0].length;j++){
			arr[i][j] = arr1[i][j]+arr2[i][j];
		}
	}
	return arr;
}
public static float[][] matrixSubstraction(float[][] arr1, float[][] arr2){
	float arr[][] = new float[arr1.length][arr1[0].length];
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr[0].length;j++){
			arr[i][j] = arr1[i][j]-arr2[i][j];
		}
	}
	return arr;
}
public static float[][] matrixMultiplication(float[][] arr1, float[][] arr2){
	float arr[][] = new float[arr1.length][arr2[0].length];
	for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2[0].length;j++){
                for (int k=0;k<arr1[0].length;k++){
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
	return arr;
}
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int row = input.nextInt();
	int column = input.nextInt();
	
	//To create matrix
	float[][] matrix = createMatrix(row,column);
	displayMatrix(matrix);
	System.out.println();
	
	//Matrix addition
	float[][] addition = matrixAddition(matrix,matrix);
	displayMatrix(addition);
	System.out.println();
	
	//Matrix substraction
	float[][] substraction = matrixSubstraction(matrix,matrix);
	displayMatrix(substraction);
	System.out.println();
	
	//Matrix multiplication
	float[][] multiplication = matrixMultiplication(matrix,matrix);
	displayMatrix(multiplication);
	System.out.println();
}
}
