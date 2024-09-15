import javax.swing.*;
public class CokeOrCokeZero{
public static void main(String args[]){
String customerName;
String drink = "";

customerName = JOptionPane.showInputDialog("Enter customer's name: ");
drink = JOptionPane.showInputDialog("Enter customer's drink preference: ");

if(drink.equals("Coke") || drink.equals("Coke Zero") ||
drink.equals("coke") || drink.equals("coke zero"))
{
System.out.println("Customer Name: " +customerName);
System.out.println("Drink: " + drink);
}
else
System.out.println(customerName + " does not prefer Coke or Coke Zero.");

System.exit(0);
}
}
