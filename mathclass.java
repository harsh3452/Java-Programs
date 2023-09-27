public class mathclass {
    public static void main (String args []){
        double pi= 3.14;
        double y = -10;
        double result = Math.abs(y);
        double sq = Math.sqrt(Math.abs(y));//Funcion inside a function to convert -10 to 10
        double max = Math.max(pi,y);
        double round = Math.round(Math.abs(pi));
        System.out.println(result);
        System.out.println("Square root of y is "+sq);
        System.out.println("Max value between the pi and y is "+max);
        System.out.println("Value of pi rounded to its lowest integer is "+round);
        System.out.println("Ceiling Value of pi is "+Math.ceil(Math.abs(pi)));
     }
}
