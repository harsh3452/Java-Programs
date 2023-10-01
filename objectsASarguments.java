public class objectsASarguments {
    public static void main (String args []){

        Garage garage = new Garage();

        Car car = new Car("Alto");
        Car car2 = new Car("Tesla");
        garage.park(car);
        garage.park(car2);

    }
}
class Garage{

    void park(Car car){
        System.out.println("The "+car.name+" is parked in the garage");
    }
}
class Car{
    String name;
    Car(String name){
        this.name = name;
    }
}
