public class constructors {
    public static void main (String args []){
        Human human1 = new Human("Rick",63,56);
        Human human2 = new Human("Morty",43,34.34);
        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.eat();
        human2.eat();
        human1.drink();
        human2.drink();
    }
}

class Human {
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println(this.name+" is eating!");
    }
    void drink(){
        System.out.println(this.name+" is drinking");
    }
}

