import javax.swing.*;
public class Airline{
public static void main(String args[]){
String passengerName = "";
String ageString = "";
int passengerAge = 0;

passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
passengerAge = Integer.parseInt(ageString);

boolean eligibleForDiscount = (passengerAge <= 6) || (passengerAge >= 65);

if (eligibleForDiscount) {
    System.out.println(passengerName + " is eligible for a 25% discount.");
} else {
    System.out.println(passengerName + " is not eligible for a 25% discount.");
}

System.exit(0);
}
}
