import java.util.Scanner;
import java.util.Random;
//import jave.util.Random; 

public class arraySearch{
   
    private static void printArray(int[] array) { //method that prints a given array
        String newStrng = " ";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        
    }
    
    public static void linearSearch(int[] array){
        int min = array[0];
        int max = array[0];
        for (int t = 0; t < array.length - 1; t++){
            if (min > array[t]){
                min = array[t];
            }
            if (max < array[t]){
                max = array[t];
            }
        }
        System.out.print("The maximum value is " + max + ", and the minimum value is "+ min +".");
    }
    
    public static void linTargetSearch(int min, int max, int target, int[] array){
        for(int i=0; i < array.length; i++){
           if((i > 1) && (target < array[i]) && (target > array[i -1])){
               System.out.println("The above value is " + array[i] + ", and the below value is " + array[i-1] + ".");
               return;
           } else if ((i == 0) && (target < array[i])){
               System.out.println("The above value is " + array[i]);
               return;
           } else if (i == array.length - 1){
               System.out.println("The below value is " + array[array.length - 1]);
               return;
           }
        }
        
    }
    
    public static void binarySearch(int[] array, int target){
        int max = array[array.length - 1];
        int min = array[0];
        int mid = 0;
        while (min < max){
            mid = ((min+max)/2);
            if (target > mid){
                min = mid + 1;
            } else if (target < mid){
                max = mid - 1;
            } else {
                System.out.println("Found "+ target + "!");
                return;
            }
        }
        System.out.println("Did not find "+ target+".");
        linTargetSearch(min, max, target, array);
        return;
    }
   
    public static void main(String[] args){ 
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int[] firstArray = new int[50];
        for (int i = 0; i < firstArray.length - 1 ; i++){
            firstArray[i] = rand.nextInt(101);
        }
       
        int[] secondArray = new int[50];
        for (int k = 0; k < secondArray.length ; k++){
            secondArray[k]=(rand.nextInt(10)+(k*10));
        }
        
        //printArray(secondArray);
        
        linearSearch(firstArray);
        System.out.println("\nThe min for array2 is " + secondArray[0] + " and the max is " +secondArray[49] +".\nWhat value would you like to search for?");
        int target = scan.nextInt();
        binarySearch(secondArray, target);
    }
}