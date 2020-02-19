/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returninfunction;

import java.util.Scanner;

/**
 *Write a method to check whether a string is a valid password
 * Password rules:
 * Password must have at least ten characters
 * Passwords consists of only letters and digits
 * Password must consists of only letters and digits
 * Password must contains at least two digits
 * @author jyoti
 */
public class Returninfunction {

    public static int length=10;
    
    public static boolean password_isValid(String password)
    {
       if(password.length()<length)
           return false;
       int digit_length=0, letter_length=0;
       
       for (int i=0; i<password.length();i++)
       {
         char ch = password.charAt(i);
         
         if(char_isnumber(ch));{
             digit_length++;
         }
         if(char_isletter(ch)){
                 letter_length++;
                 }
         else{
             return false;
         }
       }
       return(digit_length>=2 && letter_length>=2);
    }
    
    public static boolean char_isletter(char ch){
        ch = Character.toUpperCase(ch);
        
        return (ch>='A'&& ch<='Z');
    }
    
        public static boolean char_isnumber(char ch){
             return (ch>='0'&& ch<='9');
            
        }

    public static void main(String[] args) {
       System.out.println("Rules of password:\n"
               + "1.Password must have at least ten characters\n"
               + "2.Passwords consists of only letters and digits\n"
               + "3.Password must consists of only letters and digits\n"
               + "4.Password must contains at least two digits\n\n"
               + "Enter Password: ");
        Scanner pass= new Scanner(System.in);
        String password = pass.nextLine();
        
        if (password_isValid(password)){
            System.out.println("Your password is strong.");
            
        }
        else{
            System.out.println("Your password is weak.");
        }
    }
   
}
