//Emma Isaacs
//Feb 11, 2016
//hw03 -- Convert
//CSE2

import java.util.Scanner; //scanner method imported

public class Pyramid { //start class
    public static void main(String[] args){ //start main method
        Scanner pyramidDimensions = new Scanner (System.in); //declare scanner to store user's input
        System.out.println("The height of the pyramid (in form xx.x meters): "); //Asks user for height of pyramid
        double pyraHeight = pyramidDimensions.nextDouble(); //records and stores user's input of pyramid height
        System.out.println("The length of side a (in form xx.x meters): ");//asks user for side length of the square 
                                                                           //base of the pyramid
        double pyraLength = pyramidDimensions.nextDouble(); //records and stores user's input of 
                                                            //pyramid's base square length
        double volumeConversion = (int)(((pyraHeight*pyraLength*pyraLength)/3)*1000); //plugs user's input into   
                                                                                      //equation to convert into 
                                                                                      //volume of pyramid
        System.out.println("The volume of your pyramid is " + volumeConversion/1000 + " cubic meters."); //prints out volume of pyramid
    } //end main method
} //end class