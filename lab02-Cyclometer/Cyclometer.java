//Emma Isaacs
//February 5, 2016
//CSE2 10:00am lab02

public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
        int secsTrip1=480;  //interger representing the amount of seconds the first trip lasted
       	int secsTrip2=3220;  //interger representing the amount of seconds the second trip laster
		int countsTrip1=1561;  //interger representing the number of times that the wheel rotated during trip 1
		int countsTrip2=9037; //interger representing the number of times the wheel rotated during trip 2

        double wheelDiameter=27.0;  //(inches) A double that holds the info of the diameter of the wheel
        double PI=3.14159; //Another double representing the value of pi 
                    //(so that we can later use this and the above the calculate the circumference of the wheel)//
        double feetPerMile=5280.0;  //This holds the number of feet in a mile
        double inchesPerFoot=12.0;   //the holds the number of inches in a foot
        int secondsPerMinute=60;  //holds the number of seconds in a minute
        
        
        
        System.out.println("Trip 1 took " +
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts."); //after running program this prints out information about the time and distance of trip1
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");//after running program this prints out information about the time and distance of trip2
        
        //double inchToMile = inchesPerFoot / feetPerMile;
        
        double distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles; parathesis do not affect outcome since calcs are all mult/div. This integer holds the distance traveled in Trip1
	    double distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//Calculates distance in trip2
        
        double totalDistance= distanceTrip1 + distanceTrip2; //adds up both of the distances calculated above in distanceTrip1 and distanceTrip2
        
        
        //Print out the output data.
        System.out.println("Trip 1 was "+ (int) distanceTrip1+" miles");//prints trip1 in miles
        System.out.println("Trip 2 was "+ (int) distanceTrip2+" miles");//prints trip2 in miles
	    System.out.println("The total distance was "+ (int) totalDistance+" miles");//prints the total distance biked

       


	}  //end of main method   
} //end of class
