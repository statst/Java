/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.operator;

import java.util.Scanner;


public class ConditionalOperator {

    
    public static void main(String[] args) {
        System.out.println("Conditional operator \n");
        Scanner s1 = new Scanner(System.in);
        int age = s1.nextInt();
        String result = (age>18)?"You can play this game": "You cannot play this game";
        System.out.println(result);
        System.out.println("instanceOf operator \n");
        Integer in= new Integer(5);
        boolean res = in instanceof Integer;
        System.out.println(res);
    }
    
}
