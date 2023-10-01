public class arrayofobjects {
    public static void main(String args[]) {
        //Please don't kill me for the wrong spelling XD :)

        //Food[] refrigertor = new Food[3];

        Food food1 = new Food("VadaPav");
        Food food2 = new Food("Apples");
        Food food3 = new Food("Cheese");

        //refrigertor[0] = food1;
        //refrigertor[1] = food2;
        //refrigertor[2] = food3;
        Food[] refrigertor = {food1,food2,food3};
        System.out.println(refrigertor[0].name);
        System.out.println(refrigertor[1].name);
        System.out.println(refrigertor[2].name);
    }
}

class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}