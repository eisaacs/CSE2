//Emma Isaacs
//CSE2
//Apr 25 2016

import java.util.*; //I thought it would be easiest to just import everything for this program, since I wasn't sure what I'd need. 

public class Holoportation{
    
    public static String[][][] soRandom(){ //creates a random array, and fills it randomly. 
        Random rand = new Random();
        int d1 = (rand.nextInt(10) + 1); //d1, d2, d3 represnent the different dimensions of the array
        String[][][] array = new String[d1][][]; //every dimension is a random length long
        for(int i = 0; i < d1; i++) {
            int d2 = rand.nextInt(10) + 1;
            array[i] = new String[d2][];
            for(int k = 0; k < d2; k++) {
                int d3 = rand.nextInt(10) + 1;
                array[i][k] = new String[d3];
                for(int f = 0; f < d3; f++){
                    array[i][k][f] = coder(); //fills each 2rd dimension with random code
                }
            }
        }
        return array;
    }
    
    public static String coder(){ //creates random code in the form of AB1234
        Random rand = new Random();
        String[] code = new String[6]; //creates a string array, which will be turned into a string later. 
        char letter = 0;
        int number = 0;
        for (int i = 0; i < code.length; i++){
            if (i < 2){
                letter = (char)((rand.nextInt(26) + 'A')); //randomly selects letters
                code[i] = (""+letter);
            } else {
                number = rand.nextInt(9); //randomly selects numbers
                code[i]= (""+number);
            }
        }
        //code needed to return a string, and I had chars, so I needed to 'string' them togeter. 
        String returnString = (""+code[0]+code[1]+code[2]+code[3]+code[4]+code[5]);
        return returnString;
    }
    
    public static String[][][] holoport(String[][][] array, String[][][] copy){ //puts the original array into another randomly generated array. 
        for(int i = 0; i < copy.length; i++){
            if(i < array.length){
                for(int j = 0; j < copy[i].length; j++){
                    if (j < array[i].length){
                        for(int k = 0; k < copy[i][j].length; k++){ //simply copies over old array into the new one. 
                            if(k < array[i][j].length){
                                copy[i][j][k] = array[i][j][k];
                            }else{
                                copy[i][j][k] = "$$$$$$"; //for each else stament, the rest of that dimension 
                            }                             //will be filled with $$$$$$
                        }
                    } else {
                        for(int k = 0; k < copy[i][j].length; k++){ 
                            copy[i][j][k] = "$$$$$$";
                        }
                    }
                }
            } else {
                for(int j = 0; j< copy[i].length; j++){
                    for(int k = 0; k < copy[i][j].length; k++){
                        copy[i][j][k] = "$$$$$$";
                    }
                }
            }
        }
   return copy; //returns the copy array into the main method
    }
    
    public static String sampling(String[][][] array){ //allows user to search original array. 
        Scanner scan = new Scanner(System.in);
        boolean correctIn = true; //used to run a while loop, when it is false, then the loop can stop running
        String xyz = "";
        String str = "";
        while(correctIn){ //I just need this loop to run until something tells it to stop 
            System.out.println("What code are you searching for? Must be in the for ##YYYY.");
            str = scan.nextLine();
            if(str.length() == 6){ //input must be 6 characters long. 
                boolean firstLet = Character.isLetter(str.charAt(0)); //the below booleans check the 
                boolean secLet = Character.isLetter(str.charAt(1));  //type of character in the string
                boolean num1 = Character.isDigit(str.charAt(2));
                boolean num2 = Character.isDigit(str.charAt(3));
                boolean num3 = Character.isDigit(str.charAt(4));
                boolean num4 = Character.isDigit(str.charAt(5));
                //when the below if statement is all true, then the code will continue to run. 
                if((firstLet == true) && (secLet == true) && (num1 == true) && (num2 == true) && (num3 == true) && (num4 == true)){
                    for(int i = 0; i < array.length; i++){
                        for(int j = 0; j < array[i].length; j++){
                            for(int k = 0; k < array[i][j].length; k++){
                                if(array[i][j][k].equals(str) == true){ //if the code finds a match, it will printout the coordinates. 
                                    xyz = "("+(i + 1) +", "+(j + 1) +", "+(k + 1)+")"; //adds one to every val (for non-comp ppl :) )
                                    System.out.print(xyz);
                                    return xyz;
                                } else if(i == array.length - 1 && j == array[i].length - 1 && k == array[i][j].length - 1){
                                    xyz = "Could not find."; //when the loop has reached the very end of the array,
                                    System.out.println(xyz); // and never found the wanted value
                                    return xyz;
                                }
                            }
                        }
                    }
                }else{ //when the input does not have the correct formatting. 
                    System.out.println("Please enter code that begins with two number and ends in four letter (ex. AB1234).");
                }
            } else { //when code is not 6 chars long, then the program will ask the user to input another value. 
                System.out.println("Please enter a value that is 6 characters long, and in the form AB1234.");
            }
        }
    return xyz; //this is here because the terminal didn't like it when it wasn't...the program never gets to this point....
    }
    
    public static void percentage(String[][][] original, String[][][] copy){
        int counter = 0; //counts everything that is NOT $$$$$$$ for the original array
        int copyCounter = 0; //counts everything that is NOT $$$$$$ for the copy array
        for(int i = 0; i < original.length; i ++){
            for(int j = 0; j < original[i].length; j++){
                for(int k = 0; k < original[i][j].length; k++){
                    if(original[i][j][k].equals("$$$$$$")){
                        break;
                    } else {
                        counter++;
                    }
                }
            }
        }
        for(int i = 0; i < copy.length; i ++){
            for(int j = 0; j < copy[i].length; j++){
                for(int k = 0; k < copy[i][j].length; k++){
                    if(copy[i][j][k].equals("$$$$$$")){
                        break;
                    } else {
                        copyCounter++;
                    }
                }
            }
        }
        //calculated and prints out the percentage that the original array made it into the holoported array. 
    double percent =(double)((int)(((double)(counter-copyCounter)/counter)*10000))/100;
    System.out.println("---> " + percent + "% holoported."); 
    }
    
    public static String[][][] frankenstein(String[][][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    Arrays.sort(array[i][j]); //imported this....it sorts everything for me <3
                }
            }
        }
    return array;
    }
    
    public static String[][][] print(String[][][] array){ //printing method.
        for(int i = 0; i < array.length; i++){
            for (int k = 0; k < array[i].length; k++){
                System.out.print("[");
                for(int j = 0; j < array[i][k].length; j++){
                    if(j != array[i][k].length - 1){ // will not print , when it's the last d3 array. 
                        System.out.print(array[i][k][j] + ", ");
                    } else {
                        System.out.print(array[i][k][j]);
                    }
                }
                System.out.print("]");
                if (k != array[i].length - 1){ //will not pring | when it's the last d2 array. 
                    System.out.print("|");
                }
            }
            if (i != array.length - 1){ //will not print --- when it's the last d1 array. 
                System.out.print("---");
            }
        }
        return array;
    }
    
    public static void main(String[] args){ //I really only use main method to format, call, and print things. 
        String[][][] tester = soRandom(); //created arrays with soRandom method. 
        String[][][] copy = soRandom();
        
        System.out.println("Here is the ORIGINAL ARRAY:");
        print(tester);
        System.out.println("\n");
        
        System.out.println("\n \nI have created a new, empty array. I have HOLOPORTED the original array into it: ");
        print(holoport(tester, copy));
        System.out.println("\n");
        
        System.out.println("\n \nHere is the SAMPLING method. Search for specific code:");
        sampling(tester);
        
        System.out.println("\n \nHere is the PERCENTAGE method. See how much of the original array was holoported into the new one.");
        percentage(tester, copy);
        System.out.println("\n");
        
        System.out.println("Using the FRANKENSTEIN method, I sorted the original array:\n");
        print(frankenstein(tester));
    }
}