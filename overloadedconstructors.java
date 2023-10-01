public class overloadedconstructors {
    public static void main(String args[]) {
        Pizza pizza = new Pizza();
        System.out.println("Here are all the ingredients of your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println(pizza.sauce);
    }
}

class Pizza {
    String bread;
    String cheese;
    String topping;
    String sauce;

    Pizza(String bread, String cheese, String topping, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.topping = topping;
        this.sauce = sauce;
    }

    Pizza(String bread, String cheese, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
    Pizza(String bread) {
        this.bread = bread;
    }
    Pizza(){

    }
}