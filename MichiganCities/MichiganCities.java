import javax.swing.*;

public class MichiganCities{
    public static void main(String args[]) throws Exception{
        String inCity;
        String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"};
        String FINISH = "X";

        while (true) {
            inCity = JOptionPane.showInputDialog("Enter name of city: ");
            
            if (inCity.equalsIgnoreCase(FINISH)) {
                break; 
            }

            boolean foundIt = false;

            for (String city : citiesInMichigan) {
                if (city.equalsIgnoreCase(inCity)) {
                    foundIt = true;
                    break;
                }
            }

            if (foundIt) {
                JOptionPane.showMessageDialog(null, inCity + " is a city in Michigan.");
            } else {
                JOptionPane.showMessageDialog(null, inCity + " is not a city in Michigan.");
            }
        }

        System.exit(0);
    }
}
