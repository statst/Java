
package encapsulation;

class employee{
    private String name;
    private int employeeID;
    private int salary;
    
   public void setName(String name){
       this.name=name; 
}
   public void setEmployeeID(int employeeID){
       this.employeeID= employeeID;
   }
   
   public void setSalary(int salary){
       this.salary= salary;
   }
   
   public String getName(){
       return name;
   }
   
   public int getEmployeeID(){
       return employeeID;
   }
   
   public int getSalary(){
       return salary;
   }
    
    
}
public class Encapsulation {

    
    public static void main(String[] args) {
        
    }
    
}
