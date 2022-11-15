
package students;

import java.util.Scanner;  //imported scanner class
import java.util.Arrays;   // imported array class


public class Students 
{
    static int i;
    static int[] markX;
    
    public static void main(String[] args)
    {
       arry();
    }
    static void arry(){
        Scanner sc = new Scanner(System.in);  // importing scanner class
        
        markX = new int [5];
        System.out.println("Enter marks for 5 units:"); //requesting for input five units
        for (int i=0; i<5; i++)  // assigning input to a variable integer
        {
            System.out.println("Enter marks:");  // requesting input marks
            markX[i]=sc.nextInt(); 
        }
        int sum =0; // function to calculate marks
        sum = sum + markX[i];  // function to get the sum
        int avg = sum/5;
        System.out.println("sum is:");  // output the average sum
        System.out.println(sum);
        
                
    }
    
}
