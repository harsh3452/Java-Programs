public class statickewordmodifier {
    public static void main (String args []){
        //Static = modifier. A single copy of a variable/method is created and share.
        // The class "owns " the static memeber
        Friend friend1 = new Friend("Franklin");
        Friend friend2 = new Friend("Michael");
        Friend friend3 = new Friend ("Trevor");
        Friend friend4 = new Friend("Lester");
        //System.out.println(Friend.numberofFriends);
        Friend.displayFriends();
       // Math.round(a);

    }
}
class Friend{
    String name;
    static int numberofFriends;
    Friend(String name){
        this.name = name;
        numberofFriends++;
    }
    static void displayFriends(){
        System.out.println("You have "+numberofFriends+" friends");
    }
}
