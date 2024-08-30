import javax.swing.JOptionPane;
public class Payroll2{
    public static void main(String[] args){
        String salaryString;
        String dependentString;
        double salary;
        double stateTax;
        double federalTax;
        double numDependents;
        double dependentDeduction;
        double totalWithholding;
        double takeHomePay;
        
        salaryString = JOptionPane.showInputDialog("Enter Salary: ");
        salary = Double.parseDouble(salaryString);

		dependentString = JOptionPane.showInputDialog("Enter Number of Dependents: ");
        numDependents = Double.parseDouble(dependentString);

		stateTax = salary * 0.065;
        System.out.println("State Tax: $" + stateTax);
        
        federalTax = salary * 0.28;
        System.out.println("Federal Tax: $" + federalTax);

		dependentDeduction = salary * 0.025 * numDependents;
        System.out.println("Dependents Deduction: $" + dependentDeduction);

        totalWithholding = stateTax + federalTax;
        takeHomePay = salary - totalWithholding + dependentDeduction;
        System.out.println("Salary: $" + salary);
        System.out.println("Take Home Pay: $" + takeHomePay);
        System.exit(0);
    }
}