
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {
        Scanner colorValScanner = new Scanner(System.in);
        
        
        System.out.println("Please enter the value for red:");
        int rVal = colorValScanner.nextInt();
        System.out.println("Please enter the value for green:");
        int gVal = colorValScanner.nextInt();
        System.out.println("Please enter the value for blue:");
        int bVal = colorValScanner.nextInt();
        

        
        if ((rVal >= 0) && (rVal <= 255) && (gVal >= 0) && (gVal <= 255) && (bVal >= 0) && (bVal <= 255)){ //sets a range in a conditional for all inputted values. 
            
            int rHex1 = (int)(rVal / 17);    //Calculates the number of times that 16 goes into the inputted number so that 
            int gHex1 = (int)(gVal / 17);    //I can get the first part of the hexidecimal (r: xx) (g: xx) (b: xx)
            int bHex1 = (int)(bVal / 17);
            int rHex2 = rVal % 16; //Calculates the remainder, so I can get the second part of the hexidecimal (r: xx)
            int gHex2 = gVal % 16;
            int bHex2 = bVal % 16;
            
            String r1 = "_";
            String g1 = "_";
            String b1 = "_";
            String r2 = "_";
            String g2 = "_";
            String b2 = "_";
            
            //System.out.println("This is rHex1: "+ rHex1);
            
            System.out.println("This is bHex2" + bHex2);
            
            if (rHex1 > 9 && rHex1 <= 15){
                switch (15 - rHex1){
                    case 0:
                        r1 = "F";
                        break;
                    case 1:
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
                } else {
                    r1 = ""+ rHex1 +"";
                    }
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
                
            //char hexaForm = (r1 + r2 + " " + g1 + g2 + " " + b1 + b2);
            //System.out.println(b2);
            System.out.println("The decimal numbers R: " + rVal + ", G: " + gVal + ", and B: " + bVal+", is represented in hexadecimal as " + r1 + r2 + " " + g1 + g2 + " " + b1 + b2 +".");
            
        } else { //if not in the range, or simply is not an int, then this message will appear. 
            System.out.println("Sorry, there must be a mistake. Make sure that your input is an integer and falls between the range 0-255.");
            }
            
    } //to main method
} //end of class