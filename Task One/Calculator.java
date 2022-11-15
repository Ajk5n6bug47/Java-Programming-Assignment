
package calculator;

import java.util.Scanner;  // imported scanner class

public class Calculator {

   
    public static void main(String[] args) 
    {
      calculator();  
    }
    static void calculator()
    {
        Scanner sc = new Scanner(System.in);  // importing scanner class
        System.out.println("Enter first random number:");  //requesting for input (random number)
        int random1 = sc.nextInt();    //assigning input to a variable 
        
        System.out.println("Enter second random number:");  //requesting for input (random number)
        int random2 = sc.nextInt();    //assigning input to a variable 
        
        System.out.println("Enter symbol to perform: +,-,*,/");  //requesting for symbol to perfoem operations
        String symbol = sc.next();    //assigning input to a variable symbol
        
        if(symbol.equals("+"))    // function to clculate the addition 
        {
         System.out.println(random1 + random2);   //output addition of two random numbers  
        }
        else if(symbol.equals("-"))    // function to clculate the subtraction
        {
         System.out.println(random1 - random2);   //output subtraction of two random numbers 
        }
         else if(symbol.equals("*"))      // function to clculate the multiplication
        {
         System.out.println(random1 * random2);   //output multiplication of two random numbers 
        }
         else if(symbol.equals("/"))     // function to clculate the dibvision
        {
         System.out.println(random1 / random2);   //output division of two random numbers 
        }
         else
        {
         System.out.println("Enter correct symbol :");   //output the correct symbol to perform a given operation
        }
    }
    
}
