/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseif;

import java.util.Scanner;
public class Ifelseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your age here");
        Scanner s = new Scanner(System.in);
        int age= s.nextInt();
        
        if (age<18)
        {
            System.out.println("you are teenager");
        }
        else if(age>18 && age<40)
        {
            System.out.println("You are younger");
        }
        else if(age>40 && age<50)
        {
            System.out.println("you are not young or not old");
        }
        else
        {
            System.out.println("you are old");
        }
    }
    
}
