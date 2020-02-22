/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author jyoti
 */
public class Employee {
//instance variables
   String name;
   int employeeID;
   double salary;
   
   //define behaviour of variables(create instance function)
   void employeeName()
   {
       System.out.println("Name of Employee");
   }
   void employeeSalary(){
       System.out.println("Employee ID of employee.");
   }
                  
    public static void main(String[] args) {
        //create object of class employee
        Employee s1 = new Employee();
        s1.employeeSalary();
        s1.employeeName();
    }
    
}
