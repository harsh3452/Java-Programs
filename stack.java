import java.util.Scanner;

public class stack {

    static int x, size, op, top = -1;// Declaring varibles used globally for better accessibility
    static int[] stack = new int[100];// Declaring a stack
    static Scanner sc = new Scanner(System.in);

    public static void push() {
        if (top == size - 1) {
            System.out.printf("Stack Overflow!!");
        } else {
            System.out.printf("Enter the number to be pushed::");
            x = sc.nextInt();
            stack[++top] = x;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.printf("Stack Underflow!!");
        } else {
            System.out.printf("Element popped is %d", stack[top--]);
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.printf("Stack Underflow");
        } else {
            System.out.printf("Stack is \n");
            for (int i = top; i >= 0; i--) {
                System.out.printf("%d\n", stack[i]);
            }
        }
    }

    public static void main(String args[]) {
        System.out.printf("Enter the size of stack:");
        size = sc.nextInt();
        System.out.printf(" Operations \n 1.Push\t2.Pop\t3.Display\t4.Exit");
        do
        {
          System.out.printf(" \n Enter  your choice :");
          op = sc.nextInt();
          switch (op)
          {
          case 1:
          {
            push();
            break;
          }
          case 2:
          {
            pop();
            break;
          }
          case 3:
          {
            display();
            break;
          }
          case 4:
          {
            System.out.printf("SEE YAA!!");
            break;
          }
          default:
          {
            System.out.printf("Enter a valid choice!!");
            break;
          }
          }
        } while (op != 4);
    }
}
