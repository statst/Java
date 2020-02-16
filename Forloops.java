
package forloops;

import java.util.Scanner;

/**
 *
 * @author jyoti
 */
public class Forloops {

    public static void main(String[] args) {
        //Printing diamonds of asterix on screen
        System.out.println("Enter rows ");
        Scanner s1 = new Scanner(System.in);
        int rows = s1.nextInt();
        int space= rows-1;
        int j,i;
        
        for(j=1;j<=rows;j++)
        {
            for(i=1; i<=space; i++)
            {
                System.out.print(" ");
            }
            space--;
            
            for(i=1; i<=2*j-1;i++)
            {
                System.out.print("*");
                
            }
            System.out.println("");
        }
     
       space = 1;
            
            for(i=1; j<=rows-1;j++)
            {
               for(i=1; i<=space;i++) 
                System.out.print(" ");
                
            }
            space++;
            
            for(i=1; i<=2*(rows-j)-1;i++)
            {
               for(i=1; i<=space;i++) 
                System.out.print("*");
                
            }
            System.out.println(""); 
    }
    
}
