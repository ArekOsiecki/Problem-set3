import javax.swing.*;

public class LegionsDriver {
    public static void main(String[] args) {

        String legionName, legionType, legionSizeAsString;
        int legionSize;

        Legions legion = new Legions();

        legionName = JOptionPane.showInputDialog("Please enter legion's name: ");
        legionType = JOptionPane.showInputDialog("Please enter legion's type: ");
        legionSizeAsString = JOptionPane.showInputDialog("Please enter legion's size: ");
        legionSize = Integer.parseInt(legionSizeAsString);


        Legions legion2 = new Legions(legionName,legionType,legionSize);


        JOptionPane.showMessageDialog(null, legion.toString()+"\n"+legion2.toString(),
                "Ave Cesar",JOptionPane.INFORMATION_MESSAGE);


    }
}
