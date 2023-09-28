public class methodoverloading {
    public static void main (String args []){
        //overloaded methods = methods that share the same name but have different parameters
        //                     method name + parameters = method signature
          int r1 = add(3,4);
          int r2 = add(3,45,32);
          int r3 = add(3,43,234,2245);
          double r4 = add(3.5,4.345);
          double r5 = add(3.5,4.345,54.34);
          double r6 = add(45.345,34.2345,44.235,345.343);
          
          System.out.println("Addition of 2 Numbers is "+r1);

          System.out.println("Addition of 3 Numbers is "+r2);

          System.out.println("Addition of 4 numbers is "+r3);


          System.out.println("Addition of 2 double  numbers is "+r4);

          System.out.println("Addition of 3 double  numbers is "+r5);

          System.out.println("Addition of 4 double  numbers is "+r6);


    }
    static int add(int a, int b){
        
        return (a+b);
    }

    static int add(int a, int b, int c){
        return (a+b+c);
    }

    static int add(int a, int b, int c, int d){
        return (a+b+c+d);
    }

    static double add(double a, double b){
        return (a+b);
    }

     static double add(double a, double b, double c){
        return (a+b+c);
    }
    
     static double add(double a, double b, double c, double d){
        return (a+b+c+d);
    }
}
