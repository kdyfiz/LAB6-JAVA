public class Q1 {  //class declaration  
  public static void main(String[] args) {
      System.out.println("INTEGER NUMBER FROM 10 UNTIL 50 WITH INCREMENT BY 5"); // output statement to display to user 
    int  sum=0, total =0; // declare and initialize sum and total 
    for(int num=10;num<=50; num=num+5) { // num = 10 until 50 , it increment by 5 
        if(num % 2==0 && num %5== 0) {
           
            sum = sum + num; // calculate sum 
            total++; // to get the total 
        }
     }
           
            // output statement to display sum and total number can divide and divisible by 2 and 5    
            System.out.println("");
            System.out.println("sum number that can divide by 2 and 5 is : " +sum); 
            System.out.println("total number that can divide by 2 and 5 is : " +total); 
            System.out.println("");
            System.out.println("sum number that can divisible by 2 and 5 is : " +sum); 
            System.out.println("total number that can divisible by 2 and 5 is : " +total); 
   }
} 

