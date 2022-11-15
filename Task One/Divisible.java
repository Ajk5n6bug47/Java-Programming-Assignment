
package divisible;

import java.util.Scanner;  // imported scanner class

public class Divisible 
{

    
    public static void main(String[] args) 
    {
       divisibility ();
    }
    static void divisibility()
    {
        Scanner sc = new Scanner(System.in);  // importing scanner class
        System.out.println("Enter random number:");  //requesting for input random number
        int random = sc.nextInt();  //assigning input to a variable
        
        if (random%2 == 0)  // function to get the number divisible by 2 
        {
            System.out.println(random + " is divisible by 2");  //output number divisible by 2
        }
        else if (random%3 == 0)   //function to get the number divisible by 3
        {
            System.out.println(random + " is divisible by 3");  //output number divisible by 3
        }
         else if (random%4 == 0)   //function to get the number divisible by 4
        {
            System.out.println(random + " is divisible by 4");   //output number divisible by 4
        }
         else if (random%5 == 0)   //function to get the number divisible by 5
        {
            System.out.println(random + " is divisible by 5");   //output number divisible by 5
        }
         else if (random%6 == 0)    //function to get the number divisible by 6
        {
            System.out.println(random + " is divisible by 6");   //output number divisible by 6
        }
         else if (random%7 == 0)     //function to get the number divisible by 7
        {
            System.out.println(random + " is divisible by 7");   //output number divisible by 7
        }
         else if (random%8 == 0)    //function to get the number divisible by 8
        {
            System.out.println(random + " is divisible by 8");   //output number divisible by 8
        }
         else if (random%9 == 0)    //function to get the number divisible by 9
        {
            System.out.println(random + " is divisible by 9");   //output number divisible by 9
        }
        else
         {
          System.out.println(random + "Enter correct integer: ");   // output the correct integer value   
         }
    }
}
