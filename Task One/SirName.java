
package sir.name;

import java.util.Scanner;

public class SirName {

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  //importing scanner class
        System.out.println("Please Enter sir name:");  //requesting for input (sir name)
        String sname = sc.nextLine(); // assigning input to a variable sname
        
         System.out.println("Enter your age:");  //requesting for input (age)
         int age = sc.nextInt();  //assigning age to a variable age 
         
         int count = 0;  //set count to 0
          for(int i=0; i<sname.length(); i++)  //function to calculate number of strings 
          {
            if(sname.charAt(i) !=' ') 
                count++;
          }
          System.out.println("Your name:" + sname + " has:" + count + " characters.");  // output number of characters
          if(age % 2==0)  // function to get odd or even
              System.out.println(age + " is even");
          else
              System.out.println(age + " is odd");

    }
    
}
