/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.Scanner;
public class Ifelse {

    
    public static void main(String[] args) {
        System.out.println("enter a number to check even or odd");
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        if(num%2==0)
        {
            System.out.println("num + is even");
        }
        else
        {
            System.out.println("num + is odd");
        }
    }
    
}
