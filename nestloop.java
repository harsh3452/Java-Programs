import java.util.Scanner;
public class nestloop {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns ");
        int col = sc.nextInt();
        System.out.print("Enter the symbol to be used:");
        String symbol = sc.next();
        for(int i = 1; i<=row; i++)
        { 
            System.out.println();
            for(int j = 1; j <= col; j++)
            {
                System.out.print(" "+symbol);
            }
        }
        sc.close();

    }
}
