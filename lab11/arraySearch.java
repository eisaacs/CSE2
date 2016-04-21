import java.util.Scanner;
import java.util.Random;
//import jave.util.Random; 

public class arraySearch{
    
   
    public static void main(String[] args){
        
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        
    
        for (int i = 0; i < 100; i++){
            int randNum100 = (int)(Math.random()*100);
            array1[i] = randNum100;
        }
        
        int highVal1 = array1[0];
        int lowVal1 = array1[0];
        
        int highVal2 = array2[0];
        int lowVal2 = array2[0];
        

        int increaserNum = 0;
        for (int j = 0; j < 100; j++){
            int randNumIncr = (int)(Math.random()*100) + increaserNum; //so the next index will be higher than the previous
            array2[j] = randNumIncr;
            increaserNum = randNumIncr;
        }
        
        for(int k = 0; k < 100; k++){
            if (highVal1 <= array1[k]){
                highVal1 = array1[k];
            } 
            if(lowVal1 >= array1[k]){
                lowVal1 = array1[k];
            }
        }
        
    
        System.out.println("Maximum value in array1 is " + highVal1 + ".");
        System.out.println("Minimum value in array1 is " + lowVal1 +  ".");
        
        System.out.println("Maximum value in array1 is " + array2[99] + ".");
        System.out.println("Minimum value in array1 is " + array2[0] +  ".");
        
        
        System.out.print("\nPlease enter an int: ");
        Scanner indexInput = new Scanner(System.in);
        int inputValInt = indexInput.nextInt();
        //int[] indexNumArray = array2[inputValInt];
        
        if(inputValInt >= 0){
            int highBinVal = array2.length - 1;
            int lowBinVal = 0;
            while (lowBinVal <= highBinVal){
                int midBinVal = (int)(lowBinVal + (highBinVal - lowBinVal) / 2);
                if(inputValInt > array2[midBinVal]){
                    lowBinVal = midBinVal + 1;
                    //System.out.println(lowBinVal+"");
                } else if (inputValInt < array2[midBinVal]){
                    highBinVal = midBinVal -1;
                    //System.out.println(""+highBinVal);
                } else {
                    return;
                }
            System.out.println("The number above the key is " + array1[highBinVal] +"." );
            System.out.println("The number below the key is " + array2[lowBinVal]+ "." );   
            } 
        }else{
            System.out.println("Goodbye");
            return;
        }
    }
}