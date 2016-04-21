import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    
    private static void printArray(int[] array) {
        String newStrng = " ";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        
    }
    
    public static int[] randomize(int[] c){
        int temp = 0;
        
        for (int i = 0; i < 30; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(15);
            temp = c[r1];
            c[r1] = c[0];
            c[0] = temp;
        }
        return c;
    }
    
    public static void binarySearch(int[] array, int searchVal){
        int lowVal = 0;
        int highVal = array.length - 1;
        int t = 1;
        //boolean finder = false;
        while (lowVal < highVal){
            int mid = ((lowVal+highVal)/2);
            if(array[mid] > searchVal){
                highVal = mid - 1 ;
                t++;
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
    
    
    public static void linearSearch(int[] array, int searchVal){
        int i = 0;
        while(searchVal != array[i]){
            i++;
            if (i == array.length -1){
                System.out.println("Did not find " + searchVal + " with " + (i + 1) + " iterations.");
                return;
            }
        }
        System.out.println("Found " + searchVal + " with "+ (i + 1) + " iterations.");
        
    }

    
    public static void main(String[] args){
        int[] gradeArray = new int[15];
        Scanner gradeScanner = new Scanner(System.in);
        for(int i = 0; i < 15; i++){
            System.out.println("Please input grade #" + (i+1));
            if(gradeScanner.hasNextInt()){
                //int arrayPushInt = Integer.parseInt(arrayPush);
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
            } else {
                System.out.println("Please enter an integer.");
                gradeScanner.next();
                i--;
            }
        }
        System.out.println("Normal array: ");
        printArray(gradeArray);
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