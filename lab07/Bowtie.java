//Emma Isaacs
//CSE2


import java.util.Scanner;

public class Bowtie {
    public static void main(String[] args) { 
        
        Scanner bowtieNumScan = new Scanner(System.in);
        
        System.out.println("How wide would you like your bowtie?");
        int bowNum = bowtieNumScan.nextInt();
        
        int nStars = bowNum/2; //if I left the input as it was given, then the bowtie would be 2x wider than it should be 

        for (int i = -nStars; i <= nStars; i++) {  //it's easier to count from negative into positive for the bowtie, so that's what I did for this program
            for (int j = -nStars; j <= nStars; j++) { //[]
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