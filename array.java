import java.util.Scanner;
public class array {
    public static void main (String args []){
        int [] array = new int [100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            System.out.print("Array["+(i+1)+"] : ");
            array[i]= sc.nextInt();
        }
        System.out.print("Elements of the array are : ");
        for(int i = 0; i < size; i++){
            System.out.print(" "+array[i]);
        }
        sc.close();
    }
}
