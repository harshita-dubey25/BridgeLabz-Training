import java.util.*;

public class QuizApplication{
	static void saveQsAns(String[][] arr){
		arr[0][0] = "1.Number of primitive data types in Java are?";
		arr[0][1] = "a.6";
		arr[0][2] = "b.7";
		arr[0][3] = "c.8";
		arr[0][4] = "d.9";
		arr[1][0] = "2.What is the size of float and double in java?";
		arr[1][1] = "a.32 and 64";
		arr[1][2] = "b.32 and 32";
		arr[1][3] = "c 64 and 32";
		arr[1][4] = "d.64 and 64";
		arr[2][0] = "3.When an array is passed to a method, what does the method receive?";
		arr[2][1] = "a.The reference of the array";
		arr[2][2] = "b.The copy of the array";
		arr[2][3] = "c.Length of the array";
		arr[2][4] = "d.Copy of first element";
		arr[3][0] = "4.When is the object created with new keyword?";
		arr[3][1] = "a.At runtime";
		arr[3][2] = "b.At compile time";
		arr[3][3] = "c.It depends on the code";
		arr[3][4] = "d.None";
		arr[4][0] = "1.In which of the following is toString() method defined?";
		arr[4][1] = "a.java.lang.Object";
		arr[4][2] = "b.java.lang.string";
		arr[4][3] = "c.java.lang.util";
		arr[4][4] = "d.None";	
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String[][] questions = new String[5][5];
		saveQsAns(questions);
		
		int score = 0;
		
		System.out.println("Welcome\nAnswer 5 basic questions on java and check your knowledge.");
		System.out.println("Type your options - a, b, c, or d.");
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.println(questions[i][0]);
			System.out.println(questions[i][1]);
			System.out.println(questions[i][2]);
			System.out.println(questions[i][3]);
			System.out.println(questions[i][4]);
			
			char a = in.next().charAt(0);
			
			switch(i){
				case 0:
					if(a=='c'){
						score++;
					}
					break;
				case 1:
					if(a=='a'){
						score++;
					}
					break;
				case 2:
					if(a=='a'){
						score++;
					}
					break;
				case 3:
					if(a=='a'){
						score++;
					}
					break;
				case 4:
					if(a=='a'){
						score++;
					}
					break;
				default:
					break;
			}
		}
		System.out.println("Your score: "+score);
		System.out.println("Thank you.");			
	}
}