// Airline.java - This program determines if an airline passenger is
// eligible for a 25% discount.
import javax.swing.*;
public class Airline{
public static void main(String args[]){
String passengerName = "";
String ageString = "";
int passengerAge = 0;

passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
passengerAge = Integer.parseInt(ageString);
// This is the work done in the detailLoop() method

// Test to see if this customer is eligible for a 25% discount.

// This is the work done in the endOfJob() method
System.exit(0);
}
}
