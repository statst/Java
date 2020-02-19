
package function;

import java.util.Scanner;

/**
 *
 * @author jyoti
 */
public class Function {

    public static void Substraction()
    {
        System.out.println("Enter a number here: ");
        Scanner s1 = new Scanner(System.in);
        int number1 = s1.nextInt();
        
        System.out.println("Enter a second number here: ");
          Scanner s2 = new Scanner(System.in);
        int number2 = s2.nextInt();
        
        System.out.println("Substraction is: "+ (number1-number2));
            }
    public static void main(String[] args) {
        
       Substraction();
    }
    
}

