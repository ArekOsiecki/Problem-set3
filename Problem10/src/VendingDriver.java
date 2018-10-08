import javax.swing.*;

public class VendingDriver {
    public static void main(String[] args) {



        VendingMachine machine = new VendingMachine();



        Object[] possibleValues = {"Buy can","Check state","Refill", };
        int input =  JOptionPane.showOptionDialog(null,"Would you like to buy a can of soda? (click on x to exit)","Vending Machine",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,null, possibleValues, null);

        while(input!= JOptionPane.CLOSED_OPTION)//This is an interface driver
        {
            if (input == JOptionPane.YES_OPTION && machine.getCanCount() != 0) //This option allows to buy a single can of soda
            {
                machine.tokenInserted();
                machine.buyCan();
                JOptionPane.showMessageDialog(null, "Your can is in the dispenser", "Vending interface", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (input == JOptionPane.YES_OPTION ) //When there is no more cans, the message is being displayed
            {
                JOptionPane.showMessageDialog(null, "There is no cans in the machine, collect your token back", "Vending interface", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (input == JOptionPane.NO_OPTION) //This option checks tokens and cans in the machine
            {
                JOptionPane.showMessageDialog(null, machine.toString(), "Vending interface", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (input == JOptionPane.CANCEL_OPTION) //This option refills amount of cans in the machine
            {
                machine.fillUp();
                JOptionPane.showMessageDialog(null, "Machine is refilled", "Vending interface", JOptionPane.INFORMATION_MESSAGE);
            }

            input =  JOptionPane.showOptionDialog(null,"Would you like to buy a can of soda?","Vending Machine",JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null, possibleValues, null);
        }

        JOptionPane.showMessageDialog(null, "Thank you for using our machine", "Vending interface", JOptionPane.INFORMATION_MESSAGE);





    }


}
