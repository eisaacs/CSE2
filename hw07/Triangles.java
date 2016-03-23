import java.util.Scanner; //import Scanner object

public class Triangles { //start class 
    public static void main(String[] args){ //start main method
    
        Scanner triScanner = new Scanner(System.in); //initializes scanner
        
        System.out.println("Enter a number between 5 and 30: "); //Asks user for input
        int triNum = triScanner.nextInt(); //records input from user
        int t= 1; //acts as a counter for the loop in the else statement
        int numLines = (triNum*2); //creates a value for the number of lines (plus 1) that will be in the output
        System.out.println("");
        
        ////FOR//LOOP/////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("For Loop: "); //Lets user know that this is the triangle created with a for loop
        for(int i = 1; i < numLines; i++){ //keeps track of number of lines printed
            if (i <= triNum) { //if the # of lines is greater than or equal to i
                for(int q = 1; q <= i; q++) { //loop that will run as many times as the value being printed
                    System.out.print(""+i); //prints the value
                }//ends nested loop
            }//ends if statement 
            else {
                t++; //increments t, so that is can be subtracted by i
                for(int k = i - t; k > 0; k--){ //loop to print out the correct amount of numbers, and the correct numvbers
                    System.out.print(""+ (i - t)); //prints out correct value
                    }//end of nested loop
                t++; //increments t again, so that when i increases the value given from i-t decreases
            }//end of else statement
            System.out.println(""); //when a line has finished printing, then the program moves to the next line. 
        }//end of larger for loop 
        
        ////WHILE//LOOP///////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("");
        System.out.println("While Loop:"); //allows reading to see which loop was used to create the triangle
            int j = 1; //changing variables so that the program doesn't use unwanted values
            int v = 1;
            int p = 1;
            int r = 0;
            
            while(j <= numLines){ //loop that keeps track of the line the program is printing
                if(j <= triNum){ //statement only allowing the first half of triangle to be printed
                    v = j; //we want v to be equal to j, which will then act as a counter and will print the corrent number of each value
                    while(v > 0){ //when v is 0, then the loop will not run
                        System.out.print(""+j); //prints out value
                        v--; //v must be decremented so that the loop will eventually stop
                    }//end of nested while
                } else { //if when j is greater than the user's input value
                    r = r + 2; //to be subtracted from j, so that the correct value of the second half of the triangle will be printed
                    while (p <= (j - r)){ //allows the correct number of values to be printed
                        System.out.print(""+ Math.abs(j - r)); //prints out correct value
                        p++; //increments p
                    } //end of nested while loop
                    p = 1; //resets p to 1, so that is can start over again. P must stay constant since (j-r) will frequently change
                } //end of else statement
                j++; //increments j so that the line number is tracked
                System.out.println(""); //allows program to begin printing on new line
            } //end of main while loop
        
        //////DO//WHILE//LOOP///////////////////////////////////////////////////////////////////////////////////
    
        System.out.println("Do-While Loop:");
        
        int x = 1; //changing variables so that the program doesn't use unwanted values
        int y = 1;
        int z = 1;
        int n = 0;
        
        do {if(x <= triNum){ //allows the first half of the triangle to be printed
                y = x; //we want a counter equivalent to x, but not x 
                do {System.out.print(""+ x); //prints out correct number
                    y--; //decrements y
                    } while(y > 0); //print x only when statment is true
            } // end of if statement
            else {
                n = n + 2; //to be subtracted from j, so that the correct value of the second half of the triangle will be printed 
                do{ System.out.print(""+ Math.abs(x - n)); //prints the abolute value. At one point (x-n) == -1, and I only wanted 1 to be printed
                    z++; //increments z
                    } while (z <= (x - n)); // print the absolute value of (x-n) when statement is true
                z = 1; //resets z aince (x-n) changes
                } //end of else statement
            x++; //increments x to keep track of line number
            System.out.println(""); //moves program to next line
        } while ( x < numLines ); //do the above only when this statement is true
    
        
    } //end of main method 
} //end of public class