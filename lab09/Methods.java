import java.util.Random;
import java.util.Scanner;

public class Methods {
    
    public static String Adjective(){
        Random randomGenerator = new Random();
        int x = (randomGenerator.nextInt(10));
        String adj = "";
        switch (x){
            case 0:
                adj = "beautiful";
                break;
            case 1:
                adj = "chocolatey";
                break;
            case 2: 
                adj = "velvety";
                break;
            case 3:
                adj = "insane";
                break;
            case 4:
                adj = "nice";
                break;
            case 5: 
                adj = "stupid";
                break;
            case 6:
                adj = "pretty";
                break;
            case 7: 
                adj = "damn";
                break;
            case 8:
                adj = "silly";
                break;
            default:
                adj = "quiet";
                break;
        }
        return(adj);
    }
    
    public static String NounSubject(){
        Random randomGenerator = new Random();
        int y =(randomGenerator.nextInt(10));
        String subject = "";
        switch (y){
            case 0:
                subject = "the dogs";
                break;
            case 1:
                subject = "pretzels";
                break;
            case 2: 
                subject = "people";
                break;
            case 3:
                subject = "napkins";
                break;
            case 4:
                subject = "grocery bags";
                break;
            case 5: 
                subject = "zippers";
                break;
            case 6:
                subject = "chandeliers";
                break;
            case 7: 
                subject = "spoons";
                break;
            case 8:
                subject = "potatos";
                break;
            default:
                subject = "flowers";
                break;
        }
        return(subject);
    }
    
    public static String PastVerbs(){
        Random randomGenerator = new Random();
        int z = (randomGenerator.nextInt(10));
        String verb = "";
        switch (z){
            case 0:
                verb = "drank with ";
                break;
            case 1:
                verb = "ate ";
                break;
            case 2: 
                verb = "mingled with ";
                break;
            case 3:
                verb = "serenated ";
                break;
            case 4:
                verb = "loved ";
                break;
            case 5: 
                verb = "made ";
                break;
            case 6:
                verb = "evaluated ";
                break;
            case 7: 
                verb = "bewildered ";
                break;
            case 8:
                verb = "conversed with ";
                break;
            default:
                verb = "sang to ";
                break;
        }
        return(verb);
    }
    
    public static String NounObject(){
        Random randomGenerator = new Random();
        int i = (randomGenerator.nextInt(10));
        String object = "";
        switch (i){
            case 0:
                object = "banana";
                break;
            case 1:
                object = "truck";
                break;
            case 2: 
                object = "rollercoaster";
                break;
            case 3:
                object = "ladder";
                break;
            case 4:
                object = "revolution";
                break;
            case 5: 
                object = "face";
                break;
            case 6:
                object = "meatball";
                break;
            case 7: 
                object = "beaver";
                break;
            case 8:
                object = "egg";
                break;
            default:
                object = "bear";
                break;
        }
        return(object);
    }
    
    public static void main(String[] args){
        
        ////PHASE//0//////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("The "+ Adjective() + " "  + NounObject() + " " + PastVerbs()  + NounSubject() + ".");
        
        ////PHASE//1///////////////////////////////////////////////////////////////////////////////////
       /* 
        Scanner yNScanner = new Scanner(System.in);
        
        System.out.print("The ");
        for(int i = 0; i <= 7; i++){
            switch (i){
                //case 0:
                //    System.out.print("The ");
                //    break;
                case 1:
                    System.out.print(Adjective() + ", ");
                    break;
                case 2:
                    System.out.print(Adjective() + " ");
                    break;
                case 3:
                    System.out.print(NounSubject()+ " ");
                    break;
                case 4:
                    System.out.print(PastVerbs());
                    break;
                case 5:
                    System.out.print("the ");
                    break;
                case 6: 
                    System.out.print(Adjective() + " ");
                    break;
                case 7: 
                    System.out.print(NounObject() + ".");
                    break;
                default:
                    break;
                    
            }
            if (i == 7){
                System.out.println("");
                System.out.println("");
                System.out.println("Would you like another sentence?  (yes/no) ");
                String yesOrNo = yNScanner.nextLine();
                System.out.println("");
                if( yesOrNo.equals("yes") == true){
                    i = 0;
                    System.out.print("The ");
                } else { 
                    return; 
                }
            }
        }*/
        
        
    }
}