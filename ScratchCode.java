public class ScratchCode{
    
    public static void printArray(int[] array) { //method that prints a given array
        String newStrng = " ";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
       
       
    public static int[] expand(int[] in){
        int [] expArr = new int[2 * in.length];
        
        for (int i = 0; i < expArr.length; i++){
            if(i < in.length ){
                expArr[i] = in[i];
            } else {
                expArr[i] = 0;
            }
        }
        return expArr;
    }    
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};
        
        int[] hello = expand(array);
        
        printArray(hello);
    }
    
}