import java.util.Scanner; //java statement

public class Q4 { //class declaration
    public static void main (String [] args){
        Scanner s= new java.util.Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner 
        
        System.out.println("          CODE   MENU             PRICE");
        System.out.println("           1     Steak            RM 29.50");
        System.out.println("           2     Grill chicken    RM 19.50");
        System.out.println("           3     Pasta            RM 15.00");
        System.out.println("           4     Drinks           RM 4.90");
        System.out.println(" ");
        System.out.println("            PLEASE ENTER ' 0 ' TO QUIT ");
        System.out.println(" ");
        
        int code=0 , quantity =0; 
        double total=0 ;
        String menu;
        double price;
        double total_price =0;
        do {
         System.out.println ( " " );
         System.out.print("  Code of The Menu : ");
         code = s.nextInt();
        
            // switch statement to check price of the menu code 
            // calculate the total price 
            // display the result
        total = total + total_price; 
          
             switch (code) {

          case 0:
            System.out.println("          YOU ARE QUIT  THE APPLICATION ");
            break;
      
          case 1:
            System.out.print("  Quantity : ");
            quantity = s.nextInt();
            price= 29.5 ;
            total_price= price * quantity;
            menu= "Steak";
            System.out.println("     MENU     PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Steak    %.2f       %d         %.2f " , price, quantity, total_price);
            break;

          case 2:
            System.out.print("  Quantity : ");
            quantity = s.nextInt();
            price= 19.5 ;
            menu= "Grill Chicken";
            total_price= price * quantity;
            System.out.println("     MENU             PRICE      QUANTITY   TOTAL PRICE ");
            System.out.printf( "     Grill Chicken    %.2f       %d         %.2f " , price, quantity, total_price);
            break;

          case 3:
            System.out.print("  Quantity : ");
            quantity = s.nextInt();
            price= 15 ;
            menu = "Pasta";
            total_price= price * quantity;
            System.out.println("     MENU      PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Pasta     %.2f       %d         %.2f " , price, quantity, total_price);
            break;

          case 4:
            System.out.print("  Quantity : ");
            quantity = s.nextInt();
            price= 4.9 ;
            menu = "Drinks";
            total_price= price * quantity;
            System.out.println("     MENU      PRICE     QUANTITY    TOTAL PRICE ");
            System.out.printf( "     Drinks    %.2f       %d          %.2f " , price, quantity, total_price);
            break;
            
          default:
            System.out.println("     Uknown");
            break;
        }
        System.out.println ( " " );
        
    }
    
    while (code != 0); //to stop if user enter the code =0 
    System.out.printf ( " TOTAL IS RM : %.2f " , total );// print total
    
    
        
   
    
    
    
            
  
        
                                                    }
                                                }