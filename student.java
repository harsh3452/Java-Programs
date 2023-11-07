import java.util.Scanner;
public class student {
    int roll,marks;
    String name;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter you roll, name and marks");
    }
    public static void main (String args []){
        Harsh h = new Harsh();
        h.input();
        h.disp();
    }
}
class Harsh extends student {
    void disp(){
        roll=51; name ="Harsh"; marks= 100;
        System.out.println(roll+" "+name+" "+marks);
    }
    
}

