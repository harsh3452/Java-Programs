package AccessModifiers.package1;
import AccessModifiers.package2.*;

public class A {
      protected String proctectedMessage = "This is protected";
    public static void main (String args []){
        B b = new B();
        //System.out.println(b.privateMessage);//Cannot Access because it is private in B class
    }
    
}
