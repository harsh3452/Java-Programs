import java.util.Scanner;
public class if18 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter you age bruh :");
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting and other stuff !");
        }
        else
        {
            System.out.println("You are not 18 bro !! Forget your dreams and DIE");
        }
    }
}
