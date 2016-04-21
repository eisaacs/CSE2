import java.util.Scanner;
//import jave.util.Random; 

public class Arrays{
    
   
    public static void main(String[] args){
        //Random randNum = new Random();
        Scanner userInput = new Scanner(System.in);
        
        int randStudNum = (int)(Math.random()*10) + 5;
        String[] student = new String[randStudNum];
        int[] midterm = new int[randStudNum];
        System.out.println("There are " + randStudNum + " students in this course.");
        
        for(int i = 0; i < randStudNum; i++){
            System.out.print("Please insert student #" + (i+1) + "'s name: ");
            student[i] = userInput.nextLine();
            //System.out.println("");
        }
        int randGradeNum = 0;
        for(int k = 0; k <randStudNum; k++){
            randGradeNum = (int)(Math.random()*100);
            midterm[k] = randGradeNum;
        }
        
        System.out.println("\nHere are the grades for the "+ randStudNum + " students in this course:");
        for(int t = 0; t < randStudNum; t++){
            System.out.println("" + student[t] + ": " + midterm[t] + "");
        }                       
    }
}