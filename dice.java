import java.util.Random;
public class dice {
    public static void main (String args []){
        Diceroller diceRoller = new Diceroller();
        
    }
}
class Diceroller {
    Random random;
    int number;
    Diceroller(){
         random = new Random();
         
        roll();
    }
    void roll(){

        number = random.nextInt(6)+1;
        System.out.print("You rolled a:");
        System.out.print(number);
    }
}
