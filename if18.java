import java.util.Scanner;
public class if18 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter you age bruh :");
        age = sc.nextInt();
        if(age>=75)
        {
            System.out.println("YoY!! Boomer ");
        }
        else if(age>=18)
        {
            System.out.println("Damn, You are an adult (at least according to the rules)");
        }
        else
        {
            System.out.println("You are not 18 bro !! Forget your dreams and DIE");
        }
    }
}
