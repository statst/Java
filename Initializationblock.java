/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationblock;

class Test
{ 
    int a;
    //Initialization blocks
    {
    a=5;
    System.out.println("Initialization block of parent class");
    }
    Test()
    {
      System.out.println("Constructor of parent class");  
    }
}

class Test2 extends Test
{
    {
    System.out.println("Initialization block of child class");
    }
    Test2()
    {
      System.out.println("Constructor of child class");  
    }
}

public class Initializationblock {

    
    public static void main(String[] args) {
       Test t = new Test();
    }
    
}
