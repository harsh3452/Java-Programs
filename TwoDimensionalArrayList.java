import java.util.*;
public class twoDimensionalArrayList {
    public static void main (String args []){
        //2D ArrayLists = Dynamic list of lists. Also can change size during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("baking powder");
        bakeryList.add("cream");
        bakeryList.add("Cheese");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("Onions");
        produceList.add("tomatoes");
        produceList.add("Shinigami love Apples for the human world!");
        produceList.add("Ground Nuts");
        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("Soda");
        drinkList.add("Sauce(of what?huh?)");
        drinkList.add("Apple Juice!");
        drinkList.add("Beer");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(1).get(0));
    }
}
