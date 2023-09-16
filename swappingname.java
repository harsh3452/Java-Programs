public class swappingname {
    public static void main (String[] args){
      String name1 = "Harsh";
      String name2= "Aditya";
      String temp = name1;
      name1 = name2;
      name2 = temp;
      System.out.println("Name1 = "+name1);
      System.out.println("Name2 = "+name2);
    }
}
