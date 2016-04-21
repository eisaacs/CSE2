//Emma Isaacs
//CSE2
//April 21, 2016

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    
    private static void printArray(int[] array) { //method that prints a given array
        String newStrng = " ";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        
    }
    
    public static int[] randomize(int[] c){ //randomizes a given array
        int temp = 0;
        
        for (int i = 0; i < 30; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(15);
            temp = c[r1];
            c[r1] = c[0];
            c[0] = temp;
        }
        return c; //returns array c
    }
    
    public static void binarySearch(int[] array, int searchVal){ //uses binary serach to look for a given value
        int lowVal = 0;
        int highVal = array.length - 1;
        int t = 1;
        while (lowVal < highVal){
            int mid = ((lowVal+highVal)/2);
            if(array[mid] > searchVal){
                highVal = mid - 1 ;
                t++; //t keeps track of the number of iterations
            } else if (array[mid] < searchVal){
                lowVal= mid + 1;
                t++;
            } else {
                System.out.println("Found " + searchVal + " after " + t + " iterations.");
                return;
            }
        }
        System.out.println("Did not find " + searchVal + " after " + t + " iterations.");
    }
    
    
    public static void linearSearch(int[] array, int searchVal){ //linear searches an array
        int i = 0;
        while(searchVal != array[i]){ //will run until it is equal to the target val
            i++;
            if (i == array.length -1){ //if target never found it will run this. 
                System.out.println("Did not find " + searchVal + " with " + (i + 1) + " iterations.");
                return;
            }
        }
        System.out.println("Found " + searchVal + " with "+ (i + 1) + " iterations.");
        
    }

    
    public static void main(String[] args){
        int[] gradeArray = new int[15];
        Scanner gradeScanner = new Scanner(System.in);
        for(int i = 0; i < 15; i++){ //creates an array for grades inputted by user. 
            System.out.println("Please input grade #" + (i+1));
            if(gradeScanner.hasNextInt()){ //if it is an integer, then this will run. 
                int arrayPushInt = gradeScanner.nextInt();
                
                if (i > 1 && arrayPushInt < (gradeArray[i-1])){
                    System.out.println("Please enter a grade that is greater than the last value");
                    i--;
                } else if ((arrayPushInt >= 0) && (arrayPushInt <=100)){
                    gradeArray[i] = arrayPushInt;
                } else if ((arrayPushInt < 0) || (arrayPushInt > 100)){
                    System.out.println("Please enter a grade with the range 0 - 100.");
                    i--;
                } else {
                    System.out.println("Please enter an integer.");
                    i--;
                }
            } else { //if it's not an integer, then this statement will run. 
                System.out.println("Please enter an integer.");
                gradeScanner.next();
                i--;
            }
        }
        System.out.println("Normal array: "); //out puts all the info for user to see.
        printArray(gradeArray);               // also runs methods, and askes for user's input
        System.out.println("\nWhat value would you like to search for?");
        int searchNormArray = gradeScanner.nextInt();
        binarySearch(gradeArray, searchNormArray);
        
        System.out.println("\nHere is your randomized array: ");
        int[] randomArray = new int[15];
        randomArray = randomize(gradeArray);
        printArray(randomArray);
        
        System.out.println("\nWhat value would you like to search for?");
        int searchValue = gradeScanner.nextInt();       
        linearSearch(randomArray, searchValue);
    }
}