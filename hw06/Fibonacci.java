//Emma Isaacs
//March 8, 2016
//CSE02
//Hw06


import java.util.Scanner; //import Scanner object

public class Fibonacci{ //start class 
    public static void main(String[] args){ //start main method
    
        Scanner starterNumScanner = new Scanner(System.in); //declares and initializes scanner
        System.out.println("Enter the first number in the sequence: "); //askes user for input
        int a1 = starterNumScanner.nextInt(); //'collects' user's input
        System.out.println("Enter the second number in the sequence: ");//askes user for input
        int a2 = starterNumScanner.nextInt();//'collects' user's input
        System.out.println("How many custom Fibonacci numbers should be printed? ");//askes user for input
        int n = starterNumScanner.nextInt() - 3;//'collects' user's input (and subtracts 3, so that the program will print the desires number of numbers)
        System.out.print(a1 + ", " + a2 +", "); //prints out the first two numbers
        int newNum; //declares the number that will be created by adding a1 and a2
        
        while(n>=0 && a1>=0 && a2>=0){ //start of while loop. Only runs with positive numbers
            newNum = a1 + a2; //creates correct value to be stored in newNum
            if (n > 0){ //beginning of if statement that will allows the program to correctly printout a comma of a period
                System.out.print(newNum+", ");
            }else if (n==0){ //if n == 0, then this is the last time it will run the loop, and therefore the program should end the sequence with a period
                System.out.print(newNum+".");
            }
            a1 = a2; //makes the first vale the second value for the next loop
            a2 = newNum; //makes the new number created the second so that a new number can be calculated for the next time the loop runs
            n--; //decrements n. n acts as a counter. 
        }//end of loop
    }//end of main class
}//end of start method