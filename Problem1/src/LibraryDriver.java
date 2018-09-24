import javax.swing.*;
import java.awt.*;

public class LibraryDriver {
    public static void main(String[] args) {

        String title,isbn,pagesAsString,priceAsString,text="";
        int pages;
        double price;


        JTextArea textArea = new JTextArea(25,25);
        Font font = new Font("Monospaced",12,12);

        text = String.format("%-25s%-25s%-25s.2f","Title","ISBN","Number of pages","Price");
        textArea.append(text);


            int input = JOptionPane.showConfirmDialog(null, "Click on ok to start adding books",
                    "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            String iAsString = JOptionPane.showInputDialog("How many books you wish to add?");
            int count = Integer.parseInt(iAsString);


            while (input != JOptionPane.CANCEL_OPTION) {
                for (int i = 0; i <count ; i++) {
                    Book bk[] = new Book[count];
                    title = JOptionPane.showInputDialog("Add a title");
                    isbn = JOptionPane.showInputDialog("Add a ISBN number");
                    pagesAsString = JOptionPane.showInputDialog("Add number of pages");
                    pages = Integer.parseInt(pagesAsString);
                    priceAsString = JOptionPane.showInputDialog("Add a price");
                    price = Double.parseDouble(priceAsString);

                    text = String.format("\n%-25s%-25s%-25s-.2f", title, isbn, pages, price);
                    textArea.append(text);

                    input = JOptionPane.showConfirmDialog(null, "Do you wish to add another book?",
                            "Book adding", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);


                }

            }

        JOptionPane.showMessageDialog(null,textArea,"Books added",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
