//Emma Isaacs
//Feb 11, 2016
//hw03 -- Convert
//CSE2

import java.util.Scanner; //imports the scanner method

public class Convert { //start class
    public static void main(String[] args) { //start main method
    Scanner meterScanner = new Scanner (System.in); //declaring Scanner
    System.out.println("How many meters would you like to convert (in form xx.x):"); //Asks user how many 
                                                                                     //meters they would like to convert into inches
    double numMeters = meterScanner.nextDouble(); //declares and stores value in object 
                                                  //Stores take user's input.
    double inchInMeter = 39.3701; //stores the inch to meter conversion
    double meterConversion = ((int)(numMeters*inchInMeter*10000)); //converts meters into inches using arithmetic
    System.out.println("There are " + meterConversion/10000 +" inches in "+ numMeters + " meters."); //prints out conversion and meters to 
                                                                                                     //allow user to see what the conversion is. 
    }//end main method
}//end class