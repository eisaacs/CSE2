//Emma Isaacs
//CSE2

import java.util.Random; //imports random and scanner objects
import java.util.Scanner;

public class Rectangularize{
    
    public static void PrintInput(String x){ //method that will run if a string is inputted
        if (x.length() == 1){ //checks length of string. If it's one symbol long, then it'll assume it's an integer
            int newNum = Integer.parseInt(x); //explicit casts the string into an int
            PrintInput(newNum); //runs the other method
        } else { //when the length is more that one symbol
            int length = x.length();
            for (int i = length; i > 0; i--){ //runs a loop with the word's length acting as a counter
                System.out.println(x);
            }
        }
    }
    public static void PrintInput(int y){ //method that'll run if int is entered
        int t = 0;
        for(int i = y; i> 0; i--){ //loop keeps track of the amount of lines printed
            for(t = y; t> 0; t--){ //loop keeps track of the %'s printed per line
                System.out.print("%");
            }
            if (t == 0){ // when t is zero, it should be reset
                t = y; 
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args){ //main method
        System.out.print("Insert Integer or String (two characters or longer): ");
        System.out.println("");
        Scanner rectangleScan = new Scanner(System.in); //creates scanner in method
        String recInput = rectangleScan.nextLine(); //collects data as a string
        
        System.out.print("Output: ");
        System.out.println("");
        
        PrintInput(recInput); //runs methods
         
        
    }
    
    
}