import java.util.*;
public class foreachloop {
    public static void main (String args []){
        // for-each = traversing technique to iterate through the elements in an array/collections
        //            less steps, more readable
        //            less flexible
    //String [] animals = {"dogs", "cats", "peacocks", "KingFisher"}; // Array Method for input

    ArrayList<String> animals = new ArrayList<String>();// ArrayList method for input
    animals.add("Dogs");
    animals.add("Cats");
    animals.add("Peacocks");
    animals.add("KingFisher");
    for(String i : animals){
        System.out.println(i);
    }
    }

}
