package AccessModifiers.package2;
import AccessModifiers.package1.*;
import AccessModifiers.package1.A;

public class Asub extends A{
    public static void main (String args []){
      
        //C c = new C();
       // System.out.println(c.defaultMessage);
       //System.out.println(c.publicMessage);
       Asub asub = new Asub();
       System.out.println(asub.proctectedMessage);
   }
}
