public class tostring {
    public static void main (String args []){
        // toString() = specail method that all objects inherit, that return a string that "textually represents" an object.
        //               can be used both implicitly and explicitly
        Car car = new Car();
        System.out.println(car.toString());//using explicilty 
        System.out.println(car);//using implicilty
    }
}
class Car{
    String make = "Ford";
    String model = "Mustang";
    String color = "Black";
    int year = 2021;
    public String toString(){
        String myString = make + " \n " + model + " \n " +color +" \n " + year;
        return myString;
    }
}
