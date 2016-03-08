//Emma Isaacs
//March 4, 2016
//CSE02
//Lab06

//The purpose of this lab is to get familiar with loops, 
//a critical piece of syntax that is essential for many 
//programming languages.  The program you will write will 
//print out a simple “twist” on the screen.

import java.util.Scanner; //import Scanner object

public class Twist{ //start class 
    public static void main(String[] args){ //start main method
        
        Scanner lengthScanner = new Scanner(System.in); //declaring new 
                                                        //scanner
        
        System.out.println("How long would you like your twist to be?"); 
                                //asks user to input desired length of 
                                //twist
        int newLength = lengthScanner.nextInt(); //makes object to hold 
                                                 //user's length input
        
        int counter = 0; //counter so that the program can keep track of 
                         //how many twists it printed
        
        while(newLength > counter){ //beginning of while loop. It will run 
                                    //as long as newLength is greater than 
                                    //the counter
             counter++; //increments counter, so that eventaully it will be 
                        //equivalent to newLength and the loop will stop when 
                        //there are enough twists
             
            System.out.println("\\ /\\ /\\ /\\ /\\ /\\ /\\ /\\ / "); //prints 
                                                                    //out one 
             System.out.println(" X  X  X  X  X  X  X  X  ");       //layer of 
                                                                    //twists
            System.out.println("/ \\/ \\/ \\/ \\/ \\/ \\/ \\/ \\ ");
        }
    }
}