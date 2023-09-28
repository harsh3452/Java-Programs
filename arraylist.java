import java.util.ArrayList;
public class arraylist {
    public static void main (String args []){
        //ArrayList = a resizeable array
                    // elements can be added and removed after compilation phase
                    // store reference data types eg string if we want to use primitive data types we have to go for their respective wrapper class
            ArrayList<String> food = new ArrayList<String>();
            
            food.add("pizza");
            food.add("panipuri");
            food.add("vadapav");
            food.add("kar98k");
            food.set(2, "sushi");
           // food.remove(2);
           // food.clear();

            for(int i=0; i<food.size(); i++){
                System.out.println(food.get(i));
            }
     }
}
