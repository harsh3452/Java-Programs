package AbsKeyword;

public class abs {
    public static void main (String args[]){
        //abstract = abstract classes cannot be instantiated, but they can have a subclass 
        //           abstrat methods are declared without an implementation
        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        
        car.go();

    }
}
