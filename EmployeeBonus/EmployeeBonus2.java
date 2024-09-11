import javax.swing.*;
public class EmployeeBonus2{
public static void main(String args[]){
    String employeeName;
    String salaryString;
    double employeeSalary;
    String ratingString;
    int employeeRating;
    double employeeBonus;
    final double BONUS_1 = .25;
    final double BONUS_2 = .15;
    final double BONUS_3 = .10;
    final double NO_BONUS = 0.00;
    final int RATING_1 = 1;
    final int RATING_2 = 2;
    final int RATING_3 = 3;

employeeName = JOptionPane.showInputDialog("Enter employee's name: ");
salaryString = JOptionPane.showInputDialog("Enter employee's yearly salary: ");
ratingString = JOptionPane.showInputDialog("Enter employee's performance rating: ");
employeeSalary = Double.parseDouble(salaryString);
employeeRating = Integer.parseInt(ratingString);

employeeBonus = NO_BONUS;
switch (employeeRating){
    case 1:
        employeeBonus = employeeSalary * BONUS_1;
        break;
    case 2:
        employeeBonus = employeeSalary * BONUS_2;
        break;
    case 3:
        employeeBonus = employeeSalary * BONUS_3;
        break;
}


System.out.println("Employee Name " + employeeName);
System.out.println("Employee Salary $" + employeeSalary);
System.out.println("Employee Rating " + employeeRating);
System.out.println("Employee Bonus $" + employeeBonus);
System.exit(0);
}
}
