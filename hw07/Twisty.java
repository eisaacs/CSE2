//Emma Isaacs
//CSE2
//

//**The code doesn't really work. I can't figure out how to get out of an infinite loop. 


import java.util.Scanner; //import Scanner object

public class Twisty { //start class 
    public static void main(String[] args){ //start main method
    
        Scanner twistNumScanner = new Scanner(System.in); //creates and names scanner
            int twistLength = 80;
        
        do { //do while loop to track wheter user put in an acceptable length value
            System.out.println("Please input a number less than 80 and greater than 0.");
            System.out.println("Input your desired length (0 - 80): "); //asks user for information
            twistLength = twistNumScanner.nextInt(); //collects user's input
            if (twistLength >=80 || twistLength < 0) {
                System.out.println("Number not between 0 and 80");
                System.out.println();
            }
        } while(twistLength >= 80 || twistLength < 0);
        
        System.out.println("Input your desired width: ");
        int twistWidth = twistNumScanner.nextInt();
        
        do { //do while loop to track whether user put in an acceptable width value
            System.out.println("Please input a width value less the length.");
            System.out.println("Input your desired width: "); //asks user for information
            twistWidth = twistNumScanner.nextInt(); //collects user's input
            if (twistLength <= twistWidth || twistLength < 0) {
                System.out.println("Number not less than the length value");
                System.out.println();
            }
        } while(twistLength >= 80 || twistLength < 0);
        
        
        String output = "";
        int vPatt = (int)(twistLength/twistWidth); //import value; cuts up length of twist, so that I can use it to place things in the correct place
        
        for(int w = 0; w < twistWidth; w++){ //loop keeps tracks of width
            for(int l = 0; l < twistLength; l++){ //loop keeps track of length
                for(int j = 0; j <= vPatt ; j++){ //loop keeps track of where to but things
                    //upward #:
                    if(2*twistWidth*j - w - 1 == l){
                        output= "#";
                    }
                    //up /:
                    if(2*twistWidth*j + twistWidth - 1 - w == l){
                        output = "/";
                    }
                    //downward #:
                    if (2*twistWidth*j+w == l){
                        output = "#";
                    }
                    //downward \:
                    if (2*twistWidth*j+w == l+twistWidth){
                        output = "\\";
                    } 
                } //depending on the loop above a value will be chosen and placed in it's correct placement
                switch( output ){
                    case "#":
                        System.out.print("#");
                        break;
                    case "/":
                        System.out.print("/");
                        break;
                    case "\\":
                        System.out.print("\\");
                        break;
                    default:
                        System.out.print(" ");
                        break;
                }
                output = ""; //reseting output
            }//end of length loop
            System.out.println(""); //tells program to go to the next line when the line is at its end. 
        }//end of width loop
    } //end of main method
} //end of public class