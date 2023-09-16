import java.util.Scanner;
public class bubblesort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        int i,j;
        for(i=0;i<size;i++)//Taking elements from user 
        {
            System.out.print("Array["+(i+1)+"]=");
            array[i] = sc.nextInt();
        }
        System.out.print("Entered Array : ");
        for(i=0;i<size;i++)//Printing old array
        {
            System.out.print(" "+array[i]);
         }
        for(i=0;i<size;i++)//Sorting the array using two 'for loops'
        {
            for(j=i;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\nSorted array : ");
        for(i=0;i<size;i++)//Printing newly sorted array.
        {
            System.out.print(" "+array[i]);
         }
         //Because the array is sorted we can directly print largest and smallest number from the array
        int min = array[0];
        int max = array[size-1];
        System.out.print("\nLargest element in the array : "+max);
        System.out.print("\nSmallest element in the array : "+min);
    }
}
