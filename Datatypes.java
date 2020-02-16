/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;


public class Datatypes {

   
    public static void main(String[] args) {
   String str = "My name is ";
   String str1 = "Jo";
   String str3 = str + str1;
   
   System.out.println(str3);
   System.out.println(str.length());
   System.out.println(str.charAt(0));
   System.out.println(str3.toUpperCase());
    System.out.println(str.contains(str3));
    System.out.println(str.indexOf("n"));
      System.out.println(str.indexOf("is"));
    }
    
}
