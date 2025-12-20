import java.util.*;
public class SpringSeason
{
public static boolean isSpring(int month, int day){
	if((month==3 && day>=20) || (month==6 && day<=20) || (month>3 && month<6)){
		return true;
	}
	return false;
}
public static void main(String[] args)
{
	int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);	
	System.out.println(isSpring(month,day));
}
}