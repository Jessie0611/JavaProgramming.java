import javax.swing.*;
public class EmployeeBonus{
public static void main(String args[]){
String employeeName;
double numTransactions;
String transactString;
double numShifts;
String shiftString;
double dollarValue;
String dollarString;
double score;
double bonus;
final double BONUS_1 = 50.00;
final double BONUS_2 = 75.00;
final double BONUS_3 = 100.00;
final double BONUS_4 = 200.00;

employeeName = JOptionPane.showInputDialog("Enter employee's name: ");
shiftString = JOptionPane.showInputDialog("Enter number of shifts: ");
transactString = JOptionPane.showInputDialog("Enter number of transactions: ");
dollarString = JOptionPane.showInputDialog("Enter transactions dollar value: ");
numShifts = Double.parseDouble(shiftString);
numTransactions = Double.parseDouble(transactString);
dollarValue = Double.parseDouble(dollarString);

score = numTransactions * dollarValue;
if (score <= 200) {
    bonus = BONUS_4;
} else if (score <= 70) {
    bonus = BONUS_3;
} else if (score <= 31) {
    bonus = BONUS_2;
} else {
    bonus = BONUS_1;
}
System.out.println("Employee Name: " + employeeName);
System.out.println("Employee Bonus: $" + bonus);
System.exit(0);
}
}
