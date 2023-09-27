public class operators {
    public static void main (String args []){
        int temp = 24;
        if(temp>=30 && temp <= 50)
        {
           System.out.println("It is a hot day!");
        }
        else if (temp < 30 && temp >= 24)
        {
            System.out.println("It is a warm day!");
        }
        else if (temp <= 23)
        {
            System.out.println("You better get home or else you are doing to catch cold!");
        }
        else if (temp >= 51)
        {
            System.out.println("Where the fuck do you live? Huh!!");
        }
        else
        {
            System.out.println("Enter a valid temperature ");
        }

    }
}
