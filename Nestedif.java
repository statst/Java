/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

import java.util.Scanner;
public class Nestedif {

 
    public static void main(String[] args) {
        int largestnumber;
        System.out.println("enter first number here: ");
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        
         System.out.println("enter second number here: ");
        Scanner s2 = new Scanner(System.in);
        int n2 = s2.nextInt();
        
         System.out.println("enter third number here: ");
        Scanner s3 = new Scanner(System.in);
        int n3 = s3.nextInt();
        
        if(n1>n2)
        {
            if(n1>n3)
            {
                largestnumber=n1;
            }
            else
            {
                largestnumber=n2;
            }
        }
        else
        {
            if(n2>n3)
            {
                largestnumber=n2;
            }
            else
            {
                largestnumber=n3;
            }
        }
          System.out.println("largest number is :" + largestnumber);
    }
 
    
}
