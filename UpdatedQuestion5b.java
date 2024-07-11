
 

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UpdatedQuestion5b { // class declaration 

   public static void main(String[] args) throws FileNotFoundException {
        
        String matric, grade, name;
        double ftMarks, stMarks, Asg1, Asg2, Asg3, feMarks;
          
        double AsgT, AsgPer, ftPer, stPer, fePer, totalPer;
        // read from a file
                File fileIn = new File("/Users/kdyfiz/Desktop/CSC3100/LAB 6/Marks.txt");
                Scanner s = new Scanner(fileIn);
                
        int countA = 0;
        int countPass = 0;
         // start loop
        while (s.hasNext()) {
            matric = s.next();
            name = s.next();
            ftMarks = s.nextDouble();
            stMarks = s.nextDouble();
            Asg1 = s.nextDouble();
            Asg2 = s.nextDouble();
            Asg3 = s.nextDouble();
            feMarks = s.nextDouble();
            
            // calculate first test percentage
            ftPer = ftMarks/24 * 15;
            // calculate second test percentage
            stPer = stMarks/24 * 15;
            // calculate the total assignment marks
            AsgT = Asg1+Asg2+Asg3;
            // calculate percentage total assignment
            AsgPer = AsgT/48 * 30;
            // calculate final exam percentage
            fePer = feMarks/64 * 40;
            // calculate the total marks
            totalPer = ftPer+stPer+fePer+AsgPer;
            
            // if else selection to get grade based on total percentage
            if (totalPer >= 80) 
                grade = "A";
             else if (totalPer >= 75) 
                grade = "A-";
            else if (totalPer >= 70) 
                grade = "B+";
            else if (totalPer >= 65) 
                grade = "B";
            else if (totalPer >= 60) 
                grade = "B-";
            else if (totalPer >= 55) 
                grade = "C+";
            else if (totalPer >= 50) 
                grade = "C";
            else if (totalPer >= 47) 
                grade = "C-";
            else if (totalPer >= 44) 
                grade = "D+";
            else if (totalPer >= 40)
                grade = "D";
            else
                grade = "F";
            
            // calculate total student get A and pass
            if (grade.equals("A"))
                countA++;
            if ("C".compareTo(grade)>=0)
                countPass++;
            
            
            // two decimal point format
            String ftPerd = String.format("%.2f", ftPer);
            String stPerd = String.format("%.2f", stPer);
            
            String AsgPerd = String.format("%.2f", AsgPer);
            String fePerd = String.format("%.2f", fePer);
            String totalPerd = String.format("%.2f", totalPer);
             System.out.println("                      PROBLEM SOLVING AND PROGRAMMING CONCEPTS (GROUP 7)                      ");
             System.out.println("**********************************MARK EVALUATION APPLICATION********************************");
            System.out.println("MATRIC \tNAME \tFIRST TEST \tSEC TEST \tASG-TOTAL \t FINAL EXAM \tTOTAL \tGRADE");
            // console
            System.out.print(matric+"\t"+name.toUpperCase()+"\t"+ftMarks+"("+ftPerd+ "%)"+"\t"+stMarks+"("+stPerd+ "%)\t");
            System.out.print(AsgT+"("+AsgPerd+ "%)\t");
            System.out.println(feMarks+"("+fePerd+ "%)"+"\t"+totalPerd+"%\t "+grade);
            
                
         } // end for loop
        
        System.out.println("\nTOTAL STUDENT GET A : "+countA+" STUDENTS");
        System.out.println("\nTOTAL STUDENT PASS : "+countPass+" STUDENTS");
        
        
        
        
        
    }
}
