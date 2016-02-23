//Emma Isaacs
//February 19, 2016
//Lab04 -- Card Generator 

public class CardGenerator { //start class
    public static void main(String[] args) { //star static void
        int randomNum = (int) ((Math.random()*53)+1); //picks random number (intially a double, casted as a int)
        int suitNum = (randomNum % 13); //defines the number of the card within the suit
        System.out.println(randomNum);
        System.out.println(suitNum);
        if ((randomNum > 1) && (randomNum <= 13)){ //if statement over the range that is the Diamond suit
              switch (suitNum){ //start of switch statement for defining the suit number
                case 0: //first case. Ace
                    System.out.println("You picked the Ace of Diamonds."); //prints so used knows the card chosen
                    break; //break, so program knows to continue if  this is false. And knows to stop if it is true (unless told otherwise)
                case 1: 
                    System.out.println("You picked the Jack of Diamonds.");
                    break;
                default:
                    System.out.println("You picked the " + (suitNum - 2) + " of Diamonds."); //take suitNum and 'plug' it in to the string. 
                    break;
                case 2:
                    System.out.println("You picked the Queen of Diamonds.");
                    break;
                case 3:
                    System.out.println("You picked the King of Diamonds.");
                    break;
                 }
            }
        
        if ((randomNum > 14) && (randomNum <= 26)){  //if statement for the range of the Club suits
              switch (suitNum){
                case 0:
                    System.out.println("You picked the Ace of Clubs.");
                    break;
                case 1: 
                    System.out.println("You picked the Jack of Clubs.");
                    break;
                default:
                    System.out.println("You picked the " + (suitNum - 2) + " of Clubs.");
                    break;
                case 2:
                    System.out.println("You picked the Queen of Clubs.");
                    break;
                case 3:
                    System.out.println("You picked the King of Clubs.");
                    break;
                 }
        }
        if (randomNum > 27 && randomNum <= 39){ //if statement for the range of the Heart suits
              switch (suitNum){
                case 0:
                    System.out.println("You picked the Ace of Hearts.");
                    break;
                case 1: 
                    System.out.println("You picked the Jack of Hearts.");
                    break;
                default:
                    System.out.println("You picked the " + (suitNum - 2) + " of Hearts.");
                    break;
                case 2:
                    System.out.println("You picked the Queen of Hearts.");
                    break;
                case 3:
                    System.out.println("You picked the King of Hearts.");
                    break;
                 }
            }
        
       
        if (randomNum > 39 && randomNum <= 51){  //if statement for the range of the Spade suits
              switch (suitNum){
                case 0:
                    System.out.println("You picked the Ace of Spades.");
                    break;
                case 1: 
                    System.out.println("You picked the Jack of Spades.");
                    break;
                default:
                    System.out.println("You picked the " + (suitNum - 2) + " of Spades.");
                    break;
                case 2:
                    System.out.println("You picked the Queen of Spades.");
                    break;
                case 3:
                    System.out.println("You picked the King of Spades.");
                    break;
                }
        }
        
    }
}