import java.util.*;
public class MatrixManipulation
{
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
public static float[][] findTranspose(float[][] arr){
	float[][] a = new float[arr.length][arr[0].length];
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			a[i][j] = arr[j][i];
		}
	}
	return a;
}
public static float determinant2By2(float[][] arr){
	float ans = arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
    return ans;	
}
public static float determinant3By3(float[][] arr){
	float ans = (arr[0][0]*(arr[1][1]*arr[2][2] - arr[2][1]*arr[1][2]))-(arr[0][1]*(arr[1][0]*arr[2][2] - arr[2][0]*arr[1][2]))+(arr[0][2]*(arr[1][0]*arr[2][1] - arr[2][0]*arr[1][1]));
	return ans;
}
public static float[][] inverse2By2(float[][] arr){
	float det = determinant2By2(arr);
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			arr[i][j]/=det;
		}
	}
	return arr;
}
public static float[][] inverse3By3(float[][] arr){
	float det = determinant3By3(arr);
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			arr[i][j]/=det;
		}
	}
	return arr;
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int row = input.nextInt();
	int column = input.nextInt();
	
	//To create matrix
	float[][] matrix = createMatrix(row,column);
	displayMatrix(matrix);
	System.out.println();
	
	//to find transpose of matrix
	float[][] transpose = findTranspose(matrix);
	displayMatrix(transpose);
	System.out.println();
	
	//for 3*3 matrix determinant
	//System.out.println(determinant2By2(matrix));
	
	
	//for 2*2 matrix determinant
	//System.out.println(determinant2By2(matrix));
	
	//to find inverse of 2*2 matrix
	//float[][] inverse2 = inverse2By2(matrix);
	//displayMatrix(inverse2);
	//System.out.println();
	
	//to find inverse of 3*3 matrix
	float[][] inverse3 = inverse3By3(matrix);
	displayMatrix(inverse);
	System.out.println();
}
}