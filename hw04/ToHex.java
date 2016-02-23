//Emma Isaacs
//Feb 21, 2016
//CSE2 - hw04 - ToHex.java

import java.util.Scanner; //importing a scanner so that the user's input can be used in the program. 

public class ToHex { //start of the class ToHex
    public static void main(String[] args) { //start to main method
        Scanner colorValScanner = new Scanner(System.in); //declares and names scanner so I can take the user's input
        
        System.out.println("Please enter the value for red:"); //Asks user for their input
        int rVal = colorValScanner.nextInt();                  //Assigning the user's input to an object
        System.out.println("Please enter the value for green:");
        int gVal = colorValScanner.nextInt();
        System.out.println("Please enter the value for blue:");
        int bVal = colorValScanner.nextInt();
        
        if ((rVal >= 0) && (rVal <= 255) && (gVal >= 0) && (gVal <= 255) && (bVal >= 0) && (bVal <= 255)){ //sets a range in a conditional for all inputted values. 
            
            int rHex1 = (int)(rVal / 16);    //Calculates the number of times that 16 goes into the inputted number so that 
            int gHex1 = (int)(gVal / 16);    //I can get the first part of the hexidecimal (r: xx) (g: xx) (b: xx)
            int bHex1 = (int)(bVal / 16);
            int rHex2 = rVal % 16; //Calculates the remainder, so I can get the second part of the hexidecimal (r: xx)
            int gHex2 = gVal % 16;
            int bHex2 = bVal % 16;
            
            String r1 = "_"; //I will want to use these later so that I can include letters for hexadecimal
            String g1 = "_";
            String b1 = "_";
            String r2 = "_";
            String g2 = "_";
            String b2 = "_";
            
            if (rHex1 > 9 && rHex1 <= 15){ //if rHex1 is greater than 9 (and less than or 15), then it will 
                switch (15 - rHex1){       //be assigned a letter rather than a number. I set up a switch
                    case 0:                //statement to more easily assign letters to each numerical value 
                        r1 = "F";          //inputted by the user. I wrote (15 - rHex1) so that rHex1  == 15 
                        break;             //would be converted to 0, which would be assigned 'F', and so on.
                    case 1:                //I did this for all the other _Hex1 and _Hex2 values. 
                        r1 = "E";
                        break;
                    case 2:
                        r1 = "D";
                        break;
                    case 3:
                        r1 = "C";
                        break;
                    case 4:
                        r1 = "B";
                        break;
                    case 5:
                        r1 = "A";
                        break;
                    //default:
                    //    break;
                        }  
                } else {                   //When rHex1 is NOT 10 to 15, then it is simply assigned the number  
                    r1 = ""+ rHex1 +"";    //it already has. I added quotes because r1 is a String and rHex1 is not. 
                    }                      //I did this for all the other _Hex1 and _Hex22 values. 
            if (gHex1 > 9 && gHex1 <= 15){
                switch (15 - gHex1){
                    case 0:
                        g1 = "F";
                        break;
                    case 1:
                        g1 = "E";
                        break;
                    case 2:
                        g1 = "D";
                        break;
                    case 3:
                        g1 = "C";
                        break;
                    case 4:
                        g1 = "B";
                        break;
                    case 5:
                         g1 = "A";
                        break;
                    //default:
                     //   break;
                        }
                } else { 
                    g1 = "" +gHex1+"";
                    }
            if (bHex1 > 9 && bHex1 <= 15){ 
                switch(15 - bHex1){
                    case 0:
                        b1 = "F";
                        break;
                    case 1:
                        b1 = "E";
                        break;
                    case 2:
                        b1 = "D";
                        break;
                    case 3:
                        b1 = "C";
                        break;
                    case 4:
                        b1 = "B";
                        break;
                    case 5:
                        b1 = "A";
                        break;
                    //default:
                    //    break;
                        }
                } else {
                    b1 = ""+ bHex1+"";
                    }
                
            if (rHex2 > 9 && rHex2 <= 15){
               switch (15 - rHex2){
                    case 0:
                        r2 = "F";
                        break;
                    case 1:
                        r2 = "E";
                        break;
                    case 2:
                        r2 = "D";
                        break;
                    case 3:
                        r2 = "C";
                        break;
                    case 4:
                        r2 = "B";
                        break;
                    case 5:
                        r2 = "A";
                        break;
                    //default:
                    //    break;
                        }
                } else {
                    r2 = ""+rHex2+"";
                    }
            if (gHex2 > 9 && gHex2 <= 15){
                switch (15 - gHex2){
                    case 0:
                        g2 = "F";
                        break;
                    case 1:
                        g2 = "E";
                        break;
                    case 2:
                        g2 = "D";
                        break;
                    case 3:
                        g2 = "C";
                        break;
                    case 4:
                        g2 = "B";
                        break;
                    case 5:
                        g2 = "A";
                        break;
                   // default:
                    //    break;
                        }
                } else {
                    g2 = ""+ gHex2 +"";
                    }
            if (bHex2 > 9 && bHex2 <= 15){ 
                switch (15 - bHex2){
                    case 0:
                        b2 = "F";
                        break;
                    case 1:
                        b2 = "E";
                        break;
                    case 2:
                        b2 = "D";
                        break;
                    case 3:
                        b2 = "C";
                        break;
                    case 4:
                        b2 = "B";
                        break;
                    case 5:
                        b2 = "A";
                        break;
                    //default:
                  //      break;
                        }
                } else {
                    b2 = ""+ bHex2+"";
                    }
            
            
            //The below prints out the RGB inputted values and the converter hexadecimal.   
            System.out.println("The decimal numbers R:" + rVal + ", G:" + gVal + ", and B:" + bVal+", is represented in hexadecimal as " + r1 + r2 + g1 + g2 + b1 + b2 +".");
            
        } else { //if not in the range stated in the first conditional statement, (or simply is not an int), then the the below message will appear. 
            System.out.println("Sorry, there must be a mistake. Make sure that your input is an integer and falls between the range 0-255.");
            }
            
    } //to main method
} //end of class