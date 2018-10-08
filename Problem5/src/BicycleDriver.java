import javax.swing.*;

public class BicycleDriver {

    public static void main(String[] args) {

        String ownerName, modelMake, bikePriceAsString, newOwnerName, newModelMake, newBikePriceAsString;

        double bikePrice, newBikePrice;


        ownerName = JOptionPane.showInputDialog("Please enter bicycle owner name");
        modelMake = JOptionPane.showInputDialog("Please enter bicycle make");
        bikePriceAsString = JOptionPane.showInputDialog("Please enter bicycle price");
        bikePrice = Double.parseDouble(bikePriceAsString);


        Bicycle bike = new Bicycle(ownerName,modelMake,bikePrice);

        Bicycle bike2 = new Bicycle();


        newOwnerName = JOptionPane.showInputDialog("Please enter other bicycle owner name");
        bike2.setOwner(newOwnerName);
        newModelMake = JOptionPane.showInputDialog("Please enter bicycle make");
        bike2.setMake(newModelMake);
        newBikePriceAsString = JOptionPane.showInputDialog("Please enter bicycle price");
        newBikePrice = Double.parseDouble(newBikePriceAsString);
        bike2.setPrice(newBikePrice);

        bikePrice=bike.getPrice();
        bike.setPrice(bikePrice+10);


        JOptionPane.showMessageDialog(null,bike.toString()+bike2.toString(),
                "Comparison of bikes",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Cumulative value of bikes is :"+(bike.getPrice()+bike2.getPrice())+" Euro","Combined value of bikes",JOptionPane.INFORMATION_MESSAGE);


    }
}
