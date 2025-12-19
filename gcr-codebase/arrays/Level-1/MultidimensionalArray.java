import java.util.*;
public class MultidimensionalArray
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int row = input.nextInt();
	int column = input.nextInt();
	int[][] twoDArray = new int[row][column];
	int[] oneDArray = new int[row*column];
	int index=0;
	
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			twoDArray[i][j] = input.nextInt();
			oneDArray[index] = twoDArray[i][j];
			index++;
		}
	}
	System.out.println(Arrays.toString(oneDArray));
	
	
}
}