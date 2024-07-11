public class Q2 {  // class declaration 
  public static void main(String[] args) { // main methode
    int i=0; //declare and initialize i  , i is counter
    for(int no=10;no<=500; no++) { // no= 10 until 500 , and postincrement
        if(no % 5==0 && no % 10==0) {  //to get number that can divisible by 5 and 10
            System.out.print(no +" "); // print that number
            i++; // postincrement for next space 
        }
        if(i==10) { 
            System.out.println(); // to make sure after 10 number it will go to the next line
            i=0;
        }
    }
    } 
}