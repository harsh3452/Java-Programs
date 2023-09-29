public class oop {
    public static void main (String args []){
        Car myCar= new Car ();
        Car myCar2 = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);
       // myCar.drive();
       // myCar.brake();
       System.out.println();
       System.out.println(myCar2.make);
       System.out.println(myCar2.model); 

}
}
 class Car {
    String make = "Ferrari";
    String model = "GT Ford ";
    int year = 2020;
    String color = "Red";
    double price = 250000;

    void drive(){
        System.out.println("You drive the car");
    }

    void brake(){
        System.out.println("You stepped on the brake");
    }
}


