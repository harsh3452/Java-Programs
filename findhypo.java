import java.util.Scanner;
public class findhypo{
    public static void main (String args []){
        double x,y,hypo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first side : ");
        x = sc.nextDouble();
        System.out.println("Enter the value of the second side : ");
        y = sc.nextDouble();
        hypo = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is "+hypo);
        sc.close();
 }
}