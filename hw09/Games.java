//Emma Isaacs
//CSE2

import java.util.Random;
import java.util.Scanner;

public class Games{
    
    public static void guessTheBox (int y){ //guess the box method holds processes an integer
        int x =(int) (Math.random()*3) + 1; //creates a random number to determine box number
        if ((y < 0) || (y > 4)) { //if you number is greater than the number of boxes, thks method will stop
            System.out.println("Why would you even?"); 
        }
        
        System.out.println("It's in Box " + (x) + "!"); 
        if (x == 1){ //when in box 1
            if (y == 1){ //determines whether you lose or win
                System.out.println("Great job! Here's a puppy.");
            } else {
                System.out.println("You lose!");
            }
        }
        if (x == 2){
            if (y == 2){
                System.out.println("Great job! Here's a puppy.");
            } else {
                System.out.println("You lose!");
            }
        }
        if (x == 3){
            if (y == 3){
                System.out.println("Great job! Here's a puppy.");
            } else {
                System.out.println("You lose!");
            }
        } 
    return; //when if statements are done, the method will end and will return to main method
    } //end of guessTheBox
    
    public static void spinTheWheel(String b, int a){ //new method holds a string and an int
        int colorNum =(int) (Math.random()*2); //random value to determine color
        String colorPick = "";
        String colorPickLow = "";
        int numVal= 0;
        
        if (colorNum == 0){
            colorPick = "Black"; //later will allow us to check for upper and lower case words
            colorPickLow = "black";
        } else {
            colorPick = "Red";
            colorPickLow = "red";
        }
        int randNum = (int) (Math.random()*4) + 1; //determines random number for wheel spin
        numVal += randNum + 1;
        if (a > 5){ //tells the user that their input was invalid
            System.out.println("Why? That's not even a possibility! Any way...");
        }
        if ((b.equals(colorPick)) || (b.equals(colorPickLow)) && (a == numVal)){ //checks to see whether user wins or loses
            System.out.println("Congrats! You've just won a brand new car!");
        } else {
            System.out.println("You lose! It was " + colorPick + " " + numVal);
        }
    return;
    } //end of spinTheWheel
    
    public static void scrambler(String c){ //new method
        char[] wordArray = c.toCharArray(); //created character array, because it was the only way I could figure otu how to take a string apart
        int wordLength = c.length(); //determines length of the inputted word
        for (int j = c.length(); j > 0; j--){ //for loop to switch two indexes to scramble the word
            int r1 = (int) ((Math.random()*(wordLength)));//chooses a random index
            int r2 = (int) ((Math.random()*(wordLength)));//chooses a random index
            char temp = wordArray[r1]; //hold first value in r1 index to use for later
            wordArray[r1] = wordArray[r2]; //'switches' the r1 and r1 index values
            wordArray[r2] = temp; //finalizes switch
        } //end of loop. Runs as many times as the string is long
        String str = "";
        for (int n=0; n<wordArray.length; n++) { //since I cannot print an array, I had to use a for loop to be able to print it 
            str += wordArray[n];
        }
        System.out.println(str);
    return;    
    } //end of scrambler method
    
    
    
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Pick a box. 1, 2, or 3: ");
        int boxNum = scanner.nextInt(); //records user's input
        guessTheBox(boxNum); //calls box method
        
        System.out.println("Spin the Wheel! Choose a color (red, black) and a number (1 - 5).");
        String spinColor = scanner.next(); //records a string input
        int spinNum = scanner.nextInt(); //records the int input
        spinTheWheel(spinColor, spinNum); //calls wheel method
        
        System.out.print("Enter a word: ");
        String scramblerWord = scanner.next(); //records the string input
        scrambler(scramblerWord); //calls scramble method
    } //end of main method
    
} //end of public class Games