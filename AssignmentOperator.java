
package assignment.operator;


public class AssignmentOperator {

    
    public static void main(String[] args) {
        int a = 20;
        int c = a;
        int b = 10;
        System.out.println("Assignment operator: \n");
        System.out.println(c);
         System.out.println(a+=b);//a=a+b;
         System.out.println(a-=b);//a=a-b;
        System.out.println("Relational operator: \n");
        System.out.println(a==b);//a=b;
         System.out.println(a!=b);
          System.out.println(a>b);
        System.out.println("Bitwise operator: \n"); 
         System.out.println(a&b);
          System.out.println(a|b);
           System.out.println(a^b);
            System.out.println(~a);
            System.out.println(~b);
    }
    
}
