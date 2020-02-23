
package constuctorchaining;


class XY{
    XY(){
       System.out.println("Constructor of class XY"); 
    }
}
 class Z extends XY{
     Z(){
         this(9);
         System.out.println("Constructor of class Z ");
     }
        Z(int z){
            System.out.println("Constructor 2 of class Z");
        }
    }


public class Constuctorchaining {

    public static void main(String[] args) {
      Z z1 = new Z();
      
    }
    
}
