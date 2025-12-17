import java.util.*;

class EarthVolume
{
    public static void main(String[] args)
    {
        int radius=6378;
	double volumeInKm=(4/3)*Math.PI*Math.pow(radius,3); 	//Math.PI -> used to give the value of PI
	//Math.pow -> used to  find the value of the cube of 	radius
	double volumeInMiles=volumeInKm*1.6;
	System.out.println("The volume of earth in cubic kilometers is "+volumeInKm +" and cubic miles is "+volumeInMiles);
        
    }
}