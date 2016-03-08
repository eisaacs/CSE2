//Emma Isaacs
//March 8, 2016
//CSE02
//Hw06


public class TextSpinner{ //start class 
    public static void main(String[] args){ //start main method
        int counter = 0; //sets counter to 0
        String mySpin = (""); //declares and initializes a string that will eventually print outmy desires symbols
        while (counter >= 0){ //beginning of infinite while loop 
            switch(counter){ //switch statement to allow program which symbol should be printed
                case 0: //first case, when counter == 0
                    mySpin =("\b/");
                    break;
                case 1:
                    mySpin=("\b-"); //\b deletes the symbol before printing out a new one. 
                    break;
                case 2:
                    mySpin=("\b\\");
                    break;
                case 3:
                    mySpin=("\b|");
                    break;
                case 4:
                    mySpin = ("\b/");
                    break;
                case 5:
                    mySpin=("\b–");
                    break;
                case 6:
                    mySpin=("\b\\");
                    break;
                case 7:
                    mySpin=("\b|");
                    break;
                default:
                    break;
                    } //end of switch statement
                counter++; //when switch statement is over, it will increment counter
                if (counter == 7){  //when counter reaches the value of 7
                    counter = 0;    //it will be reset to the vaule of 0, so that the loop can continue to run. 
                }//end of if statement
                System.out.print(mySpin); //after each loop a symbol will be printed out. 
        }//end of while loop
    }//end of main class
}//end of public class