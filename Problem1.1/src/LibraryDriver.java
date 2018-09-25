import javax.swing.*;
import java.awt.*;

public class LibraryDriver {
    public static void main(String[] args) {

        String title, isbn, pagesAsString, priceAsString, text;
        int pages;
        double price;


        JTextArea textArea = new JTextArea(25, 45);
        Font font = new Font("Monospaced", 12, 12);

        /*text = String.format("%s%15s%15s%10s","Title","ISBN","Number of pages","Price");
        text += String.format("\n%s%15s%15s%10s","-----","-----","-------------","-----");
        textArea.append(text);*/


        int input = JOptionPane.showConfirmDialog(null, "Click on ok to start adding books",
                "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for using the program", "Library", 0);
            System.exit(0);
        } else {
            String iAsString = JOptionPane.showInputDialog("How many books you wish to add?");
            int count = Integer.parseInt(iAsString);


            while (input == JOptionPane.OK_OPTION) {
                for (int i = 0; i < count; i++) {
                    Book bk[] = new Book[count];
                    title = JOptionPane.showInputDialog("Add a title");
                    isbn = JOptionPane.showInputDialog("Add a ISBN number");
                    if(!isbn.substring(0,2).equals("978")||!isbn.substring(0,2).equals("979")){
                        JOptionPane.showMessageDialog(null, "ISBN number must start with 979 or 978!", "Library", 0);
                        isbn = JOptionPane.showInputDialog("Add a ISBN number");
                    }
                    pagesAsString = JOptionPane.showInputDialog("Add number of pages");
                    for(int j =0; j<pagesAsString.length();j++) {
                        if (!Character.isDigit(pagesAsString.charAt(i))) {
                            JOptionPane.showMessageDialog(null, "Pages number must ba a number!", "Library", 0);
                            pagesAsString = JOptionPane.showInputDialog("Add number of pages");
                        }
                    }
                    pages = Integer.parseInt(pagesAsString);
                    priceAsString = JOptionPane.showInputDialog("Add a price");
                    price = Double.parseDouble(priceAsString);

                    Book b = new Book(title, isbn, pages, price);
                    bk[i] = b;

                    text = String.format("%s\n", b.toString());
                    textArea.append(text);


                    input = JOptionPane.showConfirmDialog(null, "Do you wish to add another book?",
                            "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);


                }

            }

            JOptionPane.showMessageDialog(null, textArea, "Books added", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Thank you for using the program", "Library", 0);
            System.exit(0);
        }
    }
}
