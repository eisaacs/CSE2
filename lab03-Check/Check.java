//Emma Isaacs
//February 12, 2016
//Lab03 Check
//CSE2


import java.util.Scanner; //importing the scanner method

public class Check {
    public static void main(String[] args) {
       Scanner dinnerScanner = new Scanner (System.in); //declaring tipScanner; 'new' object
       System.out.println("Dinner's cost (in form xx.xx): $"); //prints out string so that user knows what to type in 
       double checkCost = dinnerScanner.nextDouble(); //creates object to hold the total cost of dinner information
       
       System.out.println("Tip percent (in form xx.x: ");//prints out string so that user knows to type in tip percent
       double tipPercent = dinnerScanner.nextDouble() / 100; //created object to hold the tip percent that the people want to use
       
       System.out.println("Number of people (in form xx): ");//prints out string so that user knows to type in the 
                                                             //#of people who are splitting the check
       double numPeople = dinnerScanner.nextDouble(); //creates object to hold the information of the #of people who 
                                                   //are splitting check
       double taxAndDinner = checkCost+(checkCost*tipPercent);
       double eachPersonsCost = (int)(100*(taxAndDinner)/numPeople);  //Conversion of all three
                                                                       //components to find the
                                                                       //amount each person must pay
       int dollars = (((int)(taxAndDinner*100))/100);   //whole dollar amount of cost 
       int dimes = (int)((taxAndDinner - dollars)*10);
       int pennies = (int)((((taxAndDinner-dollars)*10)-dimes)*10); //for storing digits
                  //to the right of the decimal point 
                  //for the cost$ 
        taxAndDinner = checkCost * (1 + tipPercent);
        eachPersonsCost = taxAndDinner / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars=(int)eachPersonsCost;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies + ".");
       //System.out.println("Your dinner cost $" + ((int)(100*(checkCost+(checkCost*tipPercent)))/100 + ".");
       //System.out.println("Each person owes $" + eachPersonsCost/100 + "."); //Prints out the cost that each person needs 
                                                                             //to pay 
    } //end of main method
}//end of class