import javax.swing.JOptionPane;
public class basicgui {
    public static void main (String args []){
        String name = JOptionPane.showInputDialog("Enter your Name:");
        //
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height in cms:"));
        JOptionPane.showMessageDialog(null, "Hello "+name+" \n You are "+age+" years old!\n Your height is "+height+" cms");

    }
}
