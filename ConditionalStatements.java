/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;
public class ConditionalStatements {

    
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner s1 = new Scanner(System.in);
        age = s1.nextInt();
        
        if (age>=18)
        {
    System.out.println("You are 18 years old");
        }
        System.out.println("Statement outside the if block");
    }
    
}
