public class Q6 { //class declaration
    public static void main (String [] args){ // main method 
        for(int i = 0; i < 6; ++i){ // i= 0,1,2,3,4,5 
            
            for(int n = 0; n < 6-i; n++) //  
            {
                System.out.print("\t");
            }
            for( int j = i; j >= 0; --j) // 
            {
                System.out.print((int) Math.pow(2,j) + "\t");
            }
          
             System.out.println("\n"); // 
          
        }
    }
}