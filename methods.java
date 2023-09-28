public class methods {
    public static void main (String args []){
        // method = a block of code that excecuted whenever it is called upon
        String name= "Harsh";
        int age = 19;
        hello(name,age);
    }
    static void hello(String bro, int age){
        System.out.println("Hello from Methods!!"+bro);
        System.out.println("You are "+age+" old");
    }
}
