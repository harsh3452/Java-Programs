import java.util.Scanner;
public class userinput1 {
    public static void main (String [] args) {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter 2 numbers : ");
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
        System.out.println("Addition of "+n1+" and "+n2+" is "+(n1+n2));
    } 
}
}