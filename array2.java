import java.util.Scanner;
public class array2{
    public static void main (String args []){
        int [][] array = new int [3][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print("Enter the elment at ["+(i+1)+"]["+(j+1)+"] :");
                array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
