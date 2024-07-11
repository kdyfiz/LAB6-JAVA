
/* QUESTION 2 (LAB 5)
 * SITI KHADIJAH ( 23 NOVEMBER 2021)
 */
import java.util.Scanner; //java statement
 
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Q5 { //class declaration
    private static final DecimalFormat df = new DecimalFormat("0.00");// java decimal format
                                                                       //Take one integer and two decimal
                                                                       
    
    public static void main (String [] args){
        Scanner s= new Scanner (System.in); //scanner object
                                                      //to read the input by user
                                                      // s is the shortcut of scanner
        
        
        //output statement
        System.out.println("*********************************  * * * * * MARKS EVALUATION APPLICATION FOR CSC3100 COURSE * * * * *  ******************************** ");
        
        System.out.println(" ");
        
        //prompt the user to enter number of student
        System.out.print("  PLEASE ENTER TOTAL STUDENT : ");
        int student = s.nextInt(); // student= number of student and declare it as integer 
        
        System.out.println("********************************************** ********************************************** ******************************************** ");
        
        int i=1, matric=0 , num, total= 0, pass=0, p=1; // declare matric and num as integer and initialize matric=0
        double test1=0, test2=0, percentage_test1=0, percentage_test2=0, percentage_assg=0; //declare test1, test2,percentage_test1, percentage_test20, percentage_assg as double and initialize as 0
        double assg1=0, assg2=0, assg3=0, assg=0, exam=0, percentage_exam=0, total_mark=0; // declare assg1, assg2, assg3, assg, exam, percentage_exam, total_mark and initialize as 0
        String grade="",name = ""; //declare name and grade as string 
        
         for ( num = 1; num <= student; num++) { // num++ = increase by one , num=1 and stop until num of student that user input
        
            System.out.println(" ");
        
           //prompt the user to enter the mark for matric
           System.out.print("  Please enter the mark for matric: ");
           matric = s.nextInt(); // declare matric number as a integer
        
           //prompt the user to enter the name
           System.out.print("  NAME: ");
           name = s.next(); // declare name as String
         
 
           //prompt the user to enter first test
           System.out.print("            First Test: ");
           test1 = s.nextDouble(); // first test as a test1
                                       // declare test1 as a double
         
            
           percentage_test1 = (test1/40) * 15; //to calculate percentage first test mark 
        
           System.out.print("            Second Test: ");
           test2 = s.nextDouble();
              //to calculate second test mark
            
           percentage_test2 = (test2/50)*20;//to calculate percentage second test mark
         
        
              //prompt the user to enter assignment1
           System.out.print("            Assignment 1, 2 and 3 ");
            assg1 = s.nextDouble();
            assg2 = s.nextDouble();
            assg3 = s.nextDouble(); 
        
               //to calculate all the assignments mark
                assg = ((assg1 + assg2 + assg3)) ;
                percentage_assg = (assg/90)*35 ; //to calculate percentage all the assignments mark
               
            //prompt the user to enter the final exam score
           System.out.print("            Final Examination: ");
           exam = s.nextDouble();
             
              
           percentage_exam = (exam/80)*30;  // to calculate percentage final exam mark
        
              //to calculate the total mark
           total_mark = percentage_test1 + percentage_test2 + percentage_assg + percentage_exam ; 
        
           
             
           // to check the grade base on total mark
            if (total_mark>100){
              grade = "INVALID";}
           else if(total_mark>=80)
             grade= "A";
           else if(total_mark>=75){
            grade= "A-" ;}
           else if(total_mark>=70){
            grade= "B+";}
           else if(total_mark>=65){
            grade= "B";}
           else if(total_mark>=60){
            grade= "B-";}
           else if(total_mark>=55){
            grade= "C+";}
           else if(total_mark>=50){
            grade= "C";}
           else if(total_mark>=47){
            grade= "C-";}
           else if(total_mark>=44){
            grade= "D+";}
           else if(total_mark>=40){
            grade= "D";}
           else {
            grade="F";}
        
        
           String sU = name.toUpperCase() ;// capitalize all string
                                        // sU means string uppercase
           //output statement
           System.out.println("************************************** *****************CALCULATED MARKS STUDENT "+num+"***************** ************************************** ");
        
           System.out.println(" ");
           System.out.println("NUM   MATRIC   NAME      FIRST TEST      SECOND TEST     ASG1    ASG2    ASG3    ASG-TOTAL     FINAL EXAMINATION      TOTAL MARK    GRADE");
           System.out.printf(  num+"     "+matric +"\t"+sU);
           System.out.print("\t" +test1+"(" +df.format(percentage_test1)+"%)   " +"\t"+test2+"(" +df.format(percentage_test2)+"%)   " +"\t" +assg1 +"\t" +assg2 +"\t" +assg3 +"\t" );
           System.out.print(assg +"(" + df.format(percentage_assg)+"%)" +"\t" +exam +"("+ df.format(percentage_exam)+"%)" +"\t       "  +"("+ df.format(total_mark)+"%)      " +grade);
           System.out.println("   ");
           System.out.println("   ");
           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------- "); 
           
    
                
              if (total_mark>=50) { // to get total student who pass the exam with total_mark >=50 
                pass = p;
                p ++;
            
                 if(total_mark>=80){ // // to get total student who get A with total_mark >= 80 
                   total = i;
                   i++; }}
        
        
        }
        System.out.println( " TOTAL STUDENT GET A = " +total + " STUDENTS");
        System.out.println( " TOTAL STUDENT PASS = " +pass + " STUDENTS");
        System.out.println("\n **************************************** ********************* END OF INTORMATION *********************** **************************************** ");
        
        
        
        
        
    }
 }