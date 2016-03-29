import java.util.Scanner;

public class ScratchCode {
    public static void main(String[] args) { 
        
        Scanner bowtieNumScan = new Scanner(System.in);
        
        System.out.println("How wide would you like your bowtie?");
        int bowNum = bowtieNumScan.nextInt();
        
        int nStars = bowNum/2;

        for (int i = -nStars; i <= nStars; i++) {
            for (int j = -nStars; j <= nStars; j++) {
                if (i*i < j*j){
                    System.out.print(" ");
                } 
                else{            
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}