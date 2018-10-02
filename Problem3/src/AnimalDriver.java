import javax.swing.*;


public class AnimalDriver {
    public static void main(String[] args) {

        String[] continents = new String[5];
        String type, weightAsString, ageAsString;
        double weight;
        int age;


        Animal animal = new Animal();

        JOptionPane.showMessageDialog(null, animal.toString(), "Animal Driver", JOptionPane.INFORMATION_MESSAGE);

        Animal animal2 = new Animal("Lion",continents,123.5,8);

        JOptionPane.showMessageDialog(null, animal2.toString() + "\nThe continents for this animal are: " + animal2.getContinents(), "Animal Driver", JOptionPane.INFORMATION_MESSAGE);


            type = JOptionPane.showInputDialog("Please enter the animal type");

            weightAsString = JOptionPane.showInputDialog("Please enter the weight of an animal");
            weight = Double.parseDouble(weightAsString);

            ageAsString = JOptionPane.showInputDialog("Please enter the age of an animal");
            age = Integer.parseInt(ageAsString);

            for (int i = 0; i < continents.length; i++) {
                continents[i] = JOptionPane.showInputDialog("Please enter the continent (return to exit): ");
                if (continents[i].equals(""))
                    break;
            }

            animal2 = new Animal(type,continents,weight,age);

        JOptionPane.showMessageDialog(null, animal2.toString(), "Animal Driver", JOptionPane.INFORMATION_MESSAGE);



}
}

