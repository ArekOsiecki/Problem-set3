import javax.swing.*;

public class Driver {
    public static void main(String[] args) {

        Book bk1 = new Book("The Wonky Donkey","0545261244",24,5.59);

        JOptionPane.showMessageDialog(null, bk1,"Library", JOptionPane.INFORMATION_MESSAGE );

    }
}
