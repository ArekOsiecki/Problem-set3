import javax.swing.*;
import java.text.*;
import java.util.*;

public class BookProblem {
    public static void main(String[] args) throws ParseException{

        String borrowDateAsString, returnDateAsString;
        int borrowedDay, returnedDay, totalDays;

        borrowDateAsString = JOptionPane.showInputDialog("Please enter date of borrowing in DD-MM-YYYY format: ");

        //Parsing the string to date format
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse(borrowDateAsString);
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);

        returnDateAsString = JOptionPane.showInputDialog("Please enter date of returning in DD-MM-YYYY format: ");

        //Parsing the string to date format
        Date date2 = df.parse(returnDateAsString);
        Calendar cal2 = new GregorianCalendar();
        cal2.setTime(date2);

        //Calculating day of the year
        borrowedDay = cal.get(Calendar.DAY_OF_YEAR);
        returnedDay = cal2.get(Calendar.DAY_OF_YEAR);


        totalDays = returnedDay-borrowedDay;


        JOptionPane.showMessageDialog(null, "You kept your book for "+totalDays+" days in total",
                "Days total",JOptionPane.INFORMATION_MESSAGE);


    }
}
