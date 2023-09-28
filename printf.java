public class printf {
    public static void main (String args []){
       // System.out.printf("%d This is the format string ", 123);
       boolean myBoolean = true;
       char myChar  = '@';
       String myString = "Harsh";
       int myInt = 50;
       double myDouble = 1000;

       System.out.printf("%b \n",myBoolean); 
       System.out.printf("%c \n",myChar);
       System.out.printf("%s \n",myString);
       System.out.printf("%d \n",myInt);
       System.out.printf("%.2lf \n",myDouble);
    }
}
