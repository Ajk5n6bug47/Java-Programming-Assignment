
package multiples;

import java.util.Scanner;  // imported scanner class

public class Multiples {

    
    public static void main(String[] args) {
       
    }
    static void multiples()
    {
       Scanner sc = new Scanner(System.in);  // importing scanner class
       System.out.println("Enter a number between 71 to 150: ");   // requesting for input
       int random = sc.nextInt();   //assigning input to a variable 
       
       if(random <=71)
       {
        System.out.println(random);   
       }
    }
    
}
