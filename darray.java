public class darray {
    public static void main (String args []){
        String[][] cars = new String [3][3];
        cars[0][0] = "Bullet";
        cars[0][1]="Ferrari";
        cars[0][2]="Camro";
        cars[1][0]="Silverado";
        cars[1][1]="Corvellete";
        cars[1][2]="Toyota";
        cars[2][0]="Wagonr";
        cars[2][1]="Dezire";
        cars[2][2]="Scorpio";
        /*
        //Alternate way to assign value to an array
         String[][] cars = {
                                {'Lightning','Desire','Scorpio'}
                                {'Bullet','Ferrari','Camro'}
                                {'Toyota', 'WagonR', 'Silverado'}
                             }
         */

        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for(int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}

