public class wrapper {
    public static void main (String args []){
        //wrapper class = provide a way to use primitive data types as reference data types 
        //                reference data types contains useful methods
        //                 can be used with collections (ex.ArrayList)

        //Primitive     // Wrapper
        //
        // boolean        Boolean
        // char           Character
        // int            Integer
        // double         Double

        //autoboxing = The automatic conversion that the Java Compiler makes between primitive data types and their
        //             corresponding wrapper classes
        //unboxing  = This is opposite/reverse of autoboxing

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Harsh";

        if(a==true)
        {
            System.out.println("This is true");
        }
        if(b=='@')
        {
            System.out.println("This is true");
        }
        if(c==123)
        {
            System.out.println("This is true");
        }
        if(d==3.14)
        {
            System.out.println("This is true");
        }
        if(e=="Harsh")
        {
            System.out.println("This is true");
        }
    }
}
