
package dowhileloop;

import java.util.Scanner;

/**
 *
 * @author jyoti
 */
public class Dowhileloop {


    public static void main(String[] args) {
       int i = 1;
       do
       {
          System.out.println("Enter username: ");
          Scanner s1 = new Scanner(System.in);
          String username =s1.next();
          
          System.out.println("Enter password: ");
          Scanner s2 = new Scanner(System.in);
          String password =s2.next();
          
          if (username.contains ("Java") && password.contains("programming"));
          {
              System.out.println("You have been logged in");
              break;
          }
       
          } while(i<=3);
       System.out.println("please enter correct  username and password ");
    }
    
}
