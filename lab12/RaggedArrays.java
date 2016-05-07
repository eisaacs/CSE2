import java.util.Random;
import java.util.Scanner;

public class RaggedArrays{
    
    public static void printArray(int[][] array, int col){
        for (int i = 0; i < col; i++){
            int row = array[i].length;
            for (int k = 0; k < row; k++){
                if (k == row - 1){
                    System.out.print(""+array[i][k]);
                }else{
                    System.out.print(""+array[i][k] + ", ");
                }
            }
            System.out.println("");
        }
        
    }
    
    public static int[][] makeArray(int[][] array, int col){
        int row = 0;
        Random rand = new Random();
        for (int i = 0; i < col; i++){
            row = rand.nextInt(col)+1;
            array[i] = new int[row];
            for (int k = 0; k < row; k++){
                array [i][k] = rand.nextInt(21);  
                if (k == row-1){
                    System.out.print(""+array[i][k]);
                } else {
                    System.out.print(""+array[i][k]+", ");
                }
            }
            System.out.println("");
        }
    return array;
    }
    
    public static void sortArray(int[][] array, int col){
        for(int i = 0; i < col; i++){
            int row = array[i].length;
            //System.out.print("hi");
            int[][] temp = new int[1][1];
            for(int k = 0; k < row; k++){
                int min = k;
                //System.out.print("hi");
                for (int t = k; t < row; t++){
                    if (array[i][t] < array[i][k]){
                        min = t;
                        temp[0][0] = array[i][k];
                        array[i][k] = array[i][min];
                        array[i][min] = temp[0][0];
                    } 
                    //System.out.print(temp[0][0]+"...");
                }
            }
        }
       printArray(array, col);
    }
    
    public static void reArray(int[][] array, int col){
        for(int i = 0; i < col; i++){
            int row = array[i].length;
            for(int k = 0; k < col; k++){
                if (array[i].length < array[k].length){
                    int[] temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        printArray(array, col);
    }
    
    public static void searchArray(int[][] array, int x){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (x == array[i][j]){
                    System.out.println("Value found at column "+ (j+1) + ", row "+ (i+1) +".");
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int col = scan.nextInt();
        int[][] array = new int[col][];
        
        System.out.println("Here is your unsorted array:");
        array = makeArray(array, col);
        
        System.out.println("Here is you sorted array:");
        sortArray(array, col);
        
        System.out.println("Here is your rearranged array: ");
        reArray(array, col);
        
        System.out.println("What number would you like to search for?");
        int val = scan.nextInt();
        searchArray(array, val);
    }
    
}