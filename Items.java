
package Items;

/**
 *
 * @author jyoti
 */
public class Items{
    //create instance variables
    private String name;
    private int itemnumber;
    private int price;
    
    //non-parameterized constructor
    Items(){
        name = "Honey";
        itemnumber=900;
        price=10;
}
    //parameterized constructor
    
    Items(String n, int i, int p){
       name = n;
       itemnumber= i;
       price=p;
       
    }
    Items (String n){ 
       name= n;
       itemnumber= 320;
       price=8;
    }
    
    //instance member functions of above class
    String getName(){
        return name;
    }
    
    int getItemnumber(){
        return itemnumber;
    }
    
    int getPrice(){
        return price;
    }

    public static void main(String[] args) {
  
        Items i1 = new Items("Sugar", 1500, 20);
        System.out.println(i1.getName());
        System.out.println(i1.getItemnumber());
        System.out.println(i1.getPrice());
        
         Items i2 = new Items();
        System.out.println(i2.getName());
        System.out.println(i2.getItemnumber());
        System.out.println(i2.getPrice());
        
        Items i3 = new Items("Cereal");
        System.out.println(i3.getName());
        System.out.println(i3.getItemnumber());
        System.out.println(i3.getPrice());
    }
    
    
}
