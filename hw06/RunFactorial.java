//Emma Isaacs
//March 8, 2016
//CSE02
//Hw06


import java.util.Scanner; //import Scanner object

public class RunFactorial{ //start class 
    public static void main(String[] args){ //start main method
    
    Scanner factorialScanner = new Scanner(System.in); //declares and initializes scanner
    System.out.println("Please enter an integer that is between 9 and 16: "); //asks user for input
    int numVal = factorialScanner.nextInt(); //records user's input
    int nextFactorial = numVal - 1; //calculates what the first loop should multiply the numVal by; also acts as the counter
    int finalNum = 0; //declares and initializes the final number that will be calculated
    
    if ((numVal >= 9) && (numVal <=16)){ //beginning of if statement
        while(nextFactorial >= 1){ //this loop should run until nexFactorial is 1
            finalNum = numVal*nextFactorial; //calculates each part of the factorial until nextFactorial is 1
            numVal = finalNum; //sets the finalNumber to the numVal so that the program doesn't keep multiplying the user's input into the calculate, and thereby resulting in the wrong number
            nextFactorial--; //decrements the counter integer
            if (nextFactorial == 1){ //if statement for when nextFactorial is 1, then the program will print out the final answer and end. 
                System.out.println("Input accepted: " + finalNum); //prints out factorial
                }//end of if statement
            }///end of while loop
        }else{ //beginning of else/end of if
            System.out.println("Invalid input! Make sure you number is between 9 and 16!"); //prints out when user inputs the wrong value
            }//end of else
    }//end of main class
}//end of public class