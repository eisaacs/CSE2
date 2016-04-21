import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
    
    public static int[] randomInput(){
        int num[] = new int[10];
        for (int i = 0; i <10; i++){
            num[i]=(int)(Math.random()*(num.length-1));
            System.out.print(num[i]);
        }
        return num;
    }
    
    public static int[] delete(int[] list, int pos){
        int num[] = new int[9];
        if (pos > list.length - 1){
            System.out.println("Index "+ pos+" was not found.");
        }
        for (int i = 0; i<9; i++){
            if (i < pos){
                num[i]=list[i];
            } else if (i >= pos && i < list.length - 1){
                num[i] = list[i+1];
            } else {
                System.out.println("Value, " + pos + " was not found.");
            }
        }
        return num;
    }
    
    public static int[] remove(int[] list, int target){
        int t = 0;
        for(int i = 0; i < 9; i++){
            if(target == list[i]){
                t++;
            } 
        }
        if (t == 0){
                System.out.println("Value, " + target + " was not found.");
            }
            
        int num[] = new int[9 - t];
        int k = 0;
        for(int i = 0; i < (num.length) ; i++){
            if(list[k] != target){
                num[i] = list[k];
            } else {
                i--;
            } 
            k++;
        }  
        return num;
    }
    
    public static void main(String [] arg){
    	Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
    	String answer="";
    	do{
          	System.out.print("Random input 10 ints [0-9] ");
          	num = randomInput();
          	System.out.print(num[3]);
          	String out = " The original array is:";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	while (index < 0){
          	    System.out.println("Please enter a valid integer above zero:");
          	    index = scan.nextInt();
          	}
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	while (target < 0){
          	    System.out.println("Please enter a valid integer above zero:");
          	    target = scan.nextInt();
          	}
          	newArray2 = remove(newArray1,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
    	}while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[]){
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	    if(j>0){
      	        out+=", ";
  	        }
  	        out+=num[j];
	    }
	    out+="} ";
	    return out;
    }

}