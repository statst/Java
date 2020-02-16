/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

import java.util.Scanner;
public class Switchstatement {

    public static void main(String[] args) {
        System.out.println("Which of the following is not a high level language? ");
        System.out.println("1.Java\n 2.PHP\n 3.Python\n 4.Machine Lanugae");
        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("Wrong");
                break;
            case 2:
                    System.out.println("Wrong");
                    break;
            case 3:
                    System.out.println("Wrong");
                    break;
            case 4:
                    System.out.println("True");
                    break;
           
                default:
                    System.out.println("Enter correct choice");
                            
            
        }
    }
    
}
