public class inheritance {
    public static void main (String args []){
        // inheriance = the process one class acquires the attriute and methods of another
        Car car1 = new Car();
        

        Bicycle bike = new Bicycle();

        car1.go();
        bike.stop();

        System.out.println(car1.speed);
        System.out.println(bike.speed);
        System.out.println(car1.doors);
        System.out.println(bike.pedals);
        System.out.println(bike.name);

    }
}
