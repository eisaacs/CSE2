//Emma Isaacs
//February 5, 2016
//CSE2
//Homework2 – Arthimetic 

public class Arithmetic {
    public static void main(String[] args) {
        int numPants = 3; //Number of pairs of pants
        double pantsPrice = 34.98; //Cost per pair of pants
        
        int numShirts = 2;//Number of sweatshirts
        double shirtPrice = 24.99;//Cost per shirt
        
        int numBelts = 1;//Number of belts
        double beltCost = 33.99;//cost per box of envelopes
        
        double paSalesTax = 0.06;//the tax rate
        
        double totalCostPants = numPants * pantsPrice;//total cost of all pants
        double totalCostBelt = numBelts * beltCost; //total cost of all belts
        double totalCostShirt = numShirts * shirtPrice; // total cost of all Shirts
        double saleTaxBelt = (totalCostBelt * paSalesTax); //sales tax to be added to belts cost
        double saleTaxPants = (totalCostPants * paSalesTax); //sales tax to be added to pants cost
        double saleTaxShirt = (totalCostShirt * paSalesTax); //sales tax to be added to shirt cost
        
        double totalSalesTax = (int)(100*(saleTaxBelt + saleTaxShirt + saleTaxPants)); //total Sales tax to be added to cost
                                                                                    //I multiplied all of the taxes added up 
                                                                                    //and then turned it into an integer so 
                                                                                    //that the printed out would have only two 
                                                                                    //decimals (after dividing by 100 later.)
        double purchaseCost = totalCostPants + totalCostBelt + totalCostShirt; //total cost of purchase for adding tax
        double totalPurchaseCost = (totalSalesTax/100) + purchaseCost ; //cost of purchase and tax
        
        //prints all calculated information, such as cost of each item, sales tax, purchas price (sans tax),
        //and entire purchas cost. (totalSalesTax must be divide by 100 to be able to have two decimal places)
        System.out.println(numPants+" pants cost $"+totalCostPants+" (No sales tax.)");
        System.out.println(numBelts+" belt costs $"+totalCostBelt+" (No sales tax.)");
        System.out.println(numShirts+" shirts cost $"+totalCostShirt+" (No sales tax.)");
        System.out.println("Purchase costs $"+ purchaseCost+ " with no sales tax.");
        System.out.println("With $"+ (totalSalesTax/100) +" sales tax, your completed purchase is $" + (totalPurchaseCost) +".");
    }
}